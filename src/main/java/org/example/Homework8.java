package org.example;

public class Homework8 {

    //8.	Maximum and minimum number in the array?
    public static void main(String[] args) {

       int []numbers= {23,34,19,32,12,35,98};
       int maximum=numbers[0];
       for(int num:numbers){
           if(maximum<num){
               maximum=num;
           }
       }
       int minimum=numbers[0];
       for(int num:numbers){
           if (minimum>num){
               minimum=num;
           }
       }
        System.out.println(maximum);
        System.out.println(minimum);

       }
    }

