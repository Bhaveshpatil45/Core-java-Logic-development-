package com.bhavesh.practice.patternwhileloop;

public class Pattern05 {
    private static final int PATTERN_SIZE = 5;

    /*    Expected output -
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
     */
    public static void main(String[] args) {
        int columnNo = 0;


        while (columnNo < PATTERN_SIZE) {
            int spaces = 0;
            while (spaces < PATTERN_SIZE - columnNo) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 0;
            while (stars < 2 * columnNo + 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            columnNo++;
        }



        columnNo = PATTERN_SIZE - 2;
        while (columnNo >= 0) {
            int spaces = 0;
            while (spaces < PATTERN_SIZE - columnNo) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 0;
            while (stars < 2 * columnNo + 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            columnNo--;
        }

    }
}
