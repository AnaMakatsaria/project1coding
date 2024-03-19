package org.example;

public class Homework3 {

    //3.	Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int[][]numbers={
                {1,2,3,4,},
                {7,8,9,10,},
                {12,13,14,15}
        };
        for (int i=0; i< 3;i++) {
           for (int j = 0; j < 4; j++) {
               if (numbers[i][j] % 2 == 0) {
                   System.out.print(numbers[i][j] + " ");
               }
           }
            System.out.println();

                }
        }
       }




