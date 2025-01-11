package com.bhavesh.practice.IfElseDemonstration;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println(num + "it is even number ");
        } else{
            System.out.println(num + "it is odd number");
        }
    }
}
