package com.Amazon.Coding;

import java.util.Arrays;

public class ThrottlingGateway {
    public static int throttlingGateway(int[] requestTime, int num) {
        // WRITE YOUR BRILLIANT CODE HERE
        int ans = 0 ;
        for(int i = 0 ;  i < requestTime.length; i++){
            if(i  >2 && requestTime[i] == requestTime[i-3]){
                ans++;

            } else if(i > 19 && (requestTime[i] - requestTime[i-20]) <10){

                ans++;

            } else if( i > 59 && (requestTime[i] - requestTime[i-60]) <60 ){

                ans++;

            }
        }
        return ans;
    }
    public static void main(String[] args){

        int num = 28;
        int[] requestTime = {1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,7,11,11,11,11};
        System.out.println(throttlingGateway(requestTime, num));

        int num1 = 4;
        int[] requestTime1 = {1,1,1,2};
        System.out.println(throttlingGateway(requestTime1, num1));
    }
}
