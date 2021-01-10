package com.Amazon.part1debug;

public class ReverseAlphabetCharsOnly {
    public static String reverseAlphabetCharsOnly(String inputString) {
        char[] inputChar = inputString.toCharArray();
        int right = inputString.length() - 1;
        int left = 0;
        while(left < right) {
            if(!Character.isAlphabetic(inputChar[left]))
                left++;
            else if(!Character.isAlphabetic(inputChar[right]))
                right--;
            else {
                char temp = inputChar[left];
                inputChar[left] = inputChar[right];
                inputChar[right] = temp;
                left++;
                right--;
            }
//            left++;
//            right--;
        }
        return new String(inputChar);
    }

    public static void main(String[] args){
        String s = "o^o--ba,,b";
        System.out.println(reverseAlphabetCharsOnly(s));
    }
}
