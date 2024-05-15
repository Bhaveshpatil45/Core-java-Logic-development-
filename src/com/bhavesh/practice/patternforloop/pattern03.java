package com.bhavesh.practice.patternforloop;

public class pattern03 {
    private static final int PATTERN_SIZE = 5;

    /*
            Expected Output
                    *
                  * *
                * * *
              * * * *
            * * * * *
     */
    public static void main(String[] args) {


        for (int columNo = 0;columNo < PATTERN_SIZE; columNo++){
            for (int space = 0;space < PATTERN_SIZE - columNo -1; space++){
                System.out.print("\t");
            }
            for (int rowNo = 0;rowNo <= columNo; rowNo++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}
