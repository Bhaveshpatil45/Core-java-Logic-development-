package com.bhavesh.practice.Loops.patternwhileloop;

public class Pattern01 {
    private static final int PATTERN_SIZE = 5;

/*    Expected output -
      *
      * *
      * * *
      * * * *
      * * * * *
*/
    public static void main(String[] args) {



        int columNo = 0;
        while (columNo < PATTERN_SIZE) {

            int rowNo = 0;
            while (rowNo <= columNo) {
                System.out.print("*" + "\t");
                rowNo++;
            }
            System.out.println();
            columNo++;
        }


/*
        int columNo = -1;
        while (++columNo < PATTERN_SIZE) {

            int rowNo = -1;
            while (++rowNo <= columNo) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
*/
    }
}