package org.example;

import java.util.Scanner;

public class Homework6 {

    //6.	Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number");
        int num= scan.nextInt();
        if(num % 2 != 0 ){
            System.out.println(num+" is the prime number ");
        }else{
            System.out.println(num +"is not a prime number");
        }
       }
    }

