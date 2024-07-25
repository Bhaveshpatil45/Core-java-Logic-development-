package com.bhavesh.practice.Loops.whilestmt;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;

        System.out.println("Enter a alphabet : ");
        ch = scan.nextLine().charAt(0);

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'B':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("This is a Vowel");
                    break;
                default:
                    System.out.println("This is a Consonant");
            }
        }
        else {
            System.out.println("This is not an alphabet");
        }
    }
}
