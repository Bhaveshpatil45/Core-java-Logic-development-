package com.bhavesh.practice.numberwhileloop;

import java.util.Scanner;

public class ArmstrongNumber {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a positive Number : ");

        int no = scan.nextInt();
        int originalNumber = no;
        int n = String.valueOf(no).length();
        int result = 0;

        while(no != 0){
            int digit = no % 10;
            int poweredOfDigit = 1;
            int i = 0;

            while (i < n){
                poweredOfDigit *= digit;
                i++;
            }
            result += poweredOfDigit;
            no /= 10;
        }
        System.out.println(originalNumber + (result == originalNumber? " is an Armstrong number." : " is not Armstrong number"));
    }
}
