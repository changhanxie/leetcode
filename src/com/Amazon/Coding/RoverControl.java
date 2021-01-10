package com.Amazon.Coding;

public class RoverControl {
    public static int roverMove(String[] move, int n){
        int pos = 0, row = 0, col = 0;

        for(String s : move){
            if(s == "UP"){
                if(pos - 4 >= 0 && col > 0){
                    pos -= 4;
                    col++;
                }
            }
            else if(s == "DOWN"){
                if(pos + 4 < n * n && col < n - 1){
                    pos += 4;
                    col--;
                }
            }
            else if(s == "LEFT"){
                if(pos - 1 >= 0 && row > 0){
                    pos -= 1;
                    row--;
                }
            }
            else if(s == "RIGHT"){
                if(pos + 1 < n * n && row < n - 1){
                    pos += 1;
                    row++;
                }
            }
        }


        return pos;
    }


    public static void main(String[] args) {
        String[] s1 = {"RIGHT", "UP", "DOWN", "LEFT", "DOWN", "DOWN"};
        System.out.println(roverMove(s1, 4));

        String[] s2 = {"RIGHT", "DOWN", "LEFT", "LEFT", "DOWN"};
        System.out.println(roverMove(s2, 4));

        String[] s3 = {"LEFT", "UP", "DOWN", "DOWN", "DOWN", "DOWN", "RIGHT", "RIGHT", "RIGHT", "RIGHT"};
        System.out.println(roverMove(s3, 4));
    }
}
