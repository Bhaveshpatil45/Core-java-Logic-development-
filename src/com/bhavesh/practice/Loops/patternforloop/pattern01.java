package com.bhavesh.practice.Loops.patternforloop;

public class pattern01 {
    private static final int PATTERN_SIZE = 5;

    /*    Expected output -
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void main(String[] args) {


        for (int columNo = 0; columNo < PATTERN_SIZE; columNo++) {
            for (int rowNo = 0; rowNo <= columNo; rowNo++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }


/*
        for (int columNo = -1; ++columNo < PATTERN_SIZE) {
            for (int rowNo = -1; ++rowNo <= columNo) {
                System.out.print("*" + "\t");
            }
            System.out.println();
  */


    }
}


