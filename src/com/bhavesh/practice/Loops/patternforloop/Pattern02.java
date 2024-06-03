package com.bhavesh.practice.Loops.patternforloop;

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
        for (int columNo = 0;columNo < PATTERN_SIZE; columNo++) {
                for (int rowNo = PATTERN_SIZE - columNo; rowNo > 0; rowNo--) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }


/*

        for (int columNo = 0;columNo < PATTERN_SIZE; columNo++) {
            for (int rowNo = 0;rowNo < PATTERN_SIZE - columNo; rowNo++) {
                System.out.print("*" + "\t");
            }

            System.out.println();
        }
*/
    }
}
