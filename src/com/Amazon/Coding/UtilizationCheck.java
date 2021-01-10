package com.Amazon.Coding;

public class UtilizationCheck {

    private static final int LIMIT = 2 * 100_000_000;

    public int finalInstances(int instances, int[] averageUtil) {
        for(int i = 0; i < averageUtil.length; i++){
            int util = averageUtil[i];
            if(util < 25 && instances > 1){
                //instances & 1 makes the value be 1 or 0 anyways
                //ex1:
                //2     0010
                //1     0001
                //&     0000 = 0

                //ex2:
                //3     0011
                //1     0001
                //&     0000 = 1

                //eventually, this will give us the ceiling of the instance when 3/2 + 1 = 1 + 1 = 2, or 2/2 + 0 = 1 + 0 = 1
                instances = instances / 2 + (instances & 1);
                i += 10;
            }
            else if(util > 65){
                int newInstances = instances * 2;
                if(newInstances <= LIMIT){
                    instances = newInstances;
                    i+=10;
                }
            }
        }

        return instances;
    }

    public static void main(String[] args){
        int i = 3 & 1;
        System.out.println(i);

        i = 2 & 1;
        System.out.println(i);
    }
}


