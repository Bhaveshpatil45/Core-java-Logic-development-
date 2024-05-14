package com.bhavesh.practice.number;

import java.util.Scanner;

public class SplitNo {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a positive number :");

        int no = scan.nextInt();

        //expected output e.g. 3456 = print every digit per line

        int[] digits = new int[String.valueOf(no).length()];
        int index = -1;
        while(no > 0) {
            digits[++index] = no % 10;
            no = no / 10;
        }
        index = digits.length;
        System.out.println("split digits : ");
        while (--index >= 0){
            System.out.println(digits[index]);
        }

    }
}
