package org.example;

public class Homework7 {

    //7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {

       int []numbers= {1,2,3,4,5,6,7,8,9,10};

           int first=0;
           int second=1;

               for(int j=0;j<10;j++) {
                   int next = first + second;

                   first = second;
                   second = next;
                   System.out.print(next+" ");
               }
           }
       }






