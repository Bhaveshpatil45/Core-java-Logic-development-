package com.bhavesh.practice.IfElseDemonstration;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("check number is positive, negative or zero");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (number > 0){
            System.out.println("Positive number");
        }else if(number < 0) {
            System.out.println("Negative number:");
        }else {
            System.out.println("Zero: ");
        }

    }
}
