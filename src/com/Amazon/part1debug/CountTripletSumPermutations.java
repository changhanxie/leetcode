package com.Amazon.part1debug;

public class CountTripletSumPermutations {
    public static int countTripletSumPermutations(int size, int[] arr, int tripletSum)
    {
        int count = 0;
        for(int i = 0; i < size - 2; i++)
        {
            if(tripletSum % arr[i] == 0)
            {
                //for(int j = 0; j < size - 1; j++)
                for(int j = i + 1; j < size - 1; j++)
                {
                    if(tripletSum % (arr[i] * arr[j]) == 0)
                    {
                        int value = tripletSum / (arr[i] * arr[j]);
                        for(int k = j + 1; k < size; k++)
                            if(arr[k] == value)
                                count++;
                    }
                }
            }

        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {3,3,3};
        System.out.println(countTripletSumPermutations(3, arr, 27));
    }
}
