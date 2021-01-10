package com.Amazon.part1debug;

import java.util.HashSet;
import java.util.Set;

public class CheckPairSumExists {
    public static boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(set.contains(sum - arr[i][j])) {
                    return true;
                }
                else {
                    //set.add(sum);
                    set.add(arr[i][j]);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int sum = 9;
        int arr1[][] = {{2,8},{3,10},{2,7}};
        int arr2[][] = {{2,8},{3,10},{2,9}};
        System.out.println(checkPairSumExists(3, 2, arr1, sum));
        System.out.println(checkPairSumExists(3, 2, arr2, sum));
    }
}
