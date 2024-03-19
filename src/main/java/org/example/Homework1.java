package org.example;

public class Homework1 {
    //1.	Create a program that uses an array to store a list of temperatures for a week,
    // and then uses a loop to find the highest and lowest temperature for the week.
    public static void main(String[] args) {
       int []temp= {23,34,19,32,12,35,23 };
        int highest=temp[0];
       for(int num:temp){
           if(highest<num){
               highest=num;
           }
       }
       int lowest=temp[0];
       for(int num:temp){
           if(lowest>num){
               lowest=num;
           }
       }
        System.out.println("The highest temperature of the week is "+highest);
        System.out.println("The lowest temperature of the week is "+lowest);

    }
}
