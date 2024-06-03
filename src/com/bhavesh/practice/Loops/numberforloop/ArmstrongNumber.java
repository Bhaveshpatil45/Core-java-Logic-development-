package com.bhavesh.practice.Loops.numberforloop;

import java.util.Scanner;

public class ArmstrongNumber {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a positive Number : ");

        int no = scan.nextInt();
        int originalNumber = no;
        int n = String.valueOf(no).length();
        int result = 0;

        for(;no != 0; no /= 10){
            int digit = no % 10;
            int poweredOfDigit = 1;


            for (int i = 0; i < n; i++){
                poweredOfDigit *= digit;

            }
            result += poweredOfDigit;
        }
        System.out.println(originalNumber + (result == originalNumber? " is an Armstrong number." : " is not Armstrong number"));
    }
}
