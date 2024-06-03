package com.bhavesh.practice.Loops.patternwhileloop;

public class Pattern04 {

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

        int columNo = 0;
        while(columNo < PATTERN_SIZE){

            int rowNo = 0;
            int space = 0;
            while (space < PATTERN_SIZE - columNo -1){
                System.out.print(" ");
                space++;
            }


            while (rowNo <= columNo) {
                System.out.print("* ");
                rowNo++;
            }
            System.out.println();
            columNo++;
        }
    }
}


