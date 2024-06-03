package com.bhavesh.practice.Loops.dowhileloop;

import java.util.Scanner;

public class PrimeNumber {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter a positive number : ");
        int no = scan.nextInt();

        int index = 1;
        do {
            index++;
        }while(no % index != 0);

        System.out.println((index == no)? " prime number" : " not prime number");

/*        if (index == no){
            System.out.println(" prime number");
        } else {
            System.out.println(" not prime number");
        }

 */
    }
}
