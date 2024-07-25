package com.bhavesh.practice.Loops.whilestmt;

import java.util.Scanner;

public class Read_Gender {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char gen;

        System.out.println("Enter the Gender(M/F) : ");
        gen = scan.next().charAt(0);

        switch (gen){
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Unspecified Gender>");
                break;

        }

    }
}
