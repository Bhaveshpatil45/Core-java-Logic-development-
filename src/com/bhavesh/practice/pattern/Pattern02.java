package com.bhavesh.practice.pattern;

public class Pattern02 {
    private static final int PATTERN_SIZE = 5;

/*    Expected output -
      * * * * *
      * * * *
      * * *
      * *
      *
*/
    public static void main(String[] args) {


/*
        int columNo = 0;
        while (columNo < PATTERN_SIZE) {

            int rowNo = PATTERN_SIZE - columNo;
            while (rowNo > 0) {
                System.out.print("*" + "\t");
                rowNo--;
            }
            System.out.println();
            columNo++;
        }
*/


        int columNo = 0;
        while (columNo < PATTERN_SIZE) {

            int rowNo = 0;
            while (rowNo < PATTERN_SIZE - columNo) {
                System.out.print("*" + "\t");
                rowNo++;
            }
            System.out.println();
            columNo++;
        }

    }
}