package com.bhavesh.practice.Loops.whilestmt;

import java.util.Scanner;

public class Number_OfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = 0;
        int days;

        System.out.println("Enter month number : ");
        month = scan.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Numbers of days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Numbers of days: 30");
                break;
            case 2:
                System.out.println("Number of days: 28");
                break;
            default:
                System.out.println("Invalid.... please enter 1 to 12");
        }

    }
}
