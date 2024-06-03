package com.bhavesh.practice.Loops.numberforloop;

import java.util.Scanner;

public class SplitNo {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("enter a positive number :");

            int no = scan.nextInt();

            //expected output e.g. 3456 = print every digit per line

            int[] digits = new int[String.valueOf(no).length()];
            int index = -1;
            for (;no > 0; no = no / 10) {
                digits[++index] = no % 10;

            }

            System.out.println("Split digits:");
            for (int i = index; i >= 0; i--) {
                System.out.println(digits[i]);
            }

        }
    }

