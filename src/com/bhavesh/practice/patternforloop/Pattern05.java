package com.bhavesh.practice.patternforloop;

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

        for (columnNo = 0;columnNo < PATTERN_SIZE; columnNo++) {

            for (int spaces = 0;spaces < PATTERN_SIZE - columnNo; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0;stars < 2 * columnNo + 1; stars++) {
                System.out.print("*");

            }
            System.out.println();
        }




        for (columnNo = PATTERN_SIZE - 2;columnNo >= 0; columnNo--) {

            for (int spaces = 0;spaces < PATTERN_SIZE - columnNo; spaces++) {
                System.out.print(" ");

            }

            for (int stars = 0;stars < 2 * columnNo + 1;stars++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
