package com.bhavesh.practice.Loops.whilestmt;

/*
    we have a tourism company, based on customer's birth date, we will offer them best possible discount:
    pkg details: 35,000Rs per head

   accept Birth date: offer them best discount.

   pseudo Code:
 - define Constant for pkg_cost = 35000
 - accept birthdate from customer
 - Calculate discount for month
 - Calculate discount for date
 - combine and make sum of both discounts created for month and date
 - (percent/100) * pkg_cost = actual_discount
 - final_pkg_cost = pkg_cost-actual_discount
 - display final_pkg_cost
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class WhileDemonstration {

    public static final int PKG_COST = 35000;

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("pls enter your your birth date in the format of dd-MM-yyyy: ");
        String strDate = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate customerBirthdate = LocalDate.parse(strDate, formatter);
        System.out.println("customer entered birthdate as: " + customerBirthdate.getMonth());
        double totalDiscount = 0.0;

        //fetch discount of month
        totalDiscount = totalDiscount + calculateDiscountForMonth(customerBirthdate.getMonth());

        //fetch discount of date
        totalDiscount= totalDiscount + calculateDiscountForDate(customerBirthdate.getDayOfMonth());

        //actual_discount
        double actualDiscount = (totalDiscount/100) * PKG_COST;

        //calculate final package cost: final_pkg_cost = pkg_cost- actual_discount
        int finalPackageCost = PKG_COST - (int) actualDiscount;

        System.out.println("Dear customer, your total discount is  : " + actualDiscount);
        System.out.println("and your final package price is : " + finalPackageCost);
    }

    //** Month wise discount business rules:
    //Jan,Feb,Mar - 3% discount
    //Apr, May, June - 4% discount
    //July, Aug, Sept - 10% discount
    //Oct, Nov, Dec - 0% discount

    public static double calculateDiscountForMonth(Month month) {
        double monthWiseDiscount = 0.0;

        switch (month){
            case JANUARY, FEBRUARY, MARCH:
                monthWiseDiscount = 3.0;
                break;
            case APRIL,MAY,JUNE:
                monthWiseDiscount = 4.0;
                break;
            case JULY,AUGUST,SEPTEMBER:
                monthWiseDiscount = 10.0;
                break;
            default:
                monthWiseDiscount = 0.0;
        }
        return monthWiseDiscount;
    }

    //** dates wise discount business rules:
    //   1-2 : 2%
    //   5-10 : 2.5%
    //   10-15 : 1%
    //   15-20 : 1.5%
    //   20-25 : 3%
    //   25-31 : 3.5%


    public static double calculateDiscountForDate(int date){
        double dateWiseDiscount = 0.0;
        switch (date){
            case 1,2,3,4,5:
                dateWiseDiscount = 2.0;
                break;
            case 6,7,8,9,10:
                dateWiseDiscount = 2.5;
                break;
            case 11,12,13,14,15:
                dateWiseDiscount = 1.0;
                break;
            case 16,17,18,19,20:
                dateWiseDiscount = 1.5;
                break;
            case 21,22,23,24,25:
                dateWiseDiscount = 3.0;
                break;
            case 26,27,28,29,30,31:
                dateWiseDiscount = 3.5;
                break;
        }

        return dateWiseDiscount;

    }
}