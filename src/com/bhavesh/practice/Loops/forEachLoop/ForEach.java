package com.bhavesh.practice.Loops.forEachLoop;

public class ForEach {
    public static void main(String[] args) {

    //    int[] array = new int[5];
    //    array[0] = 50;
    //    array[0] = 60;
    //    array[0] = 70;
    //    array[0] = 80;
    //    array[0] = 90;

        int[] array = new int[]{50,60,70,80,90};

        int index = 0;
        System.out.println("printing array using while loop: ");
        while(index < array.length){
            System.out.println(array[index]);
            index++;
        }
        System.out.println("====================================================");
        System.out.println("printing array using for loop: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("====================================================");
        System.out.println("printing array using forEach loop: ");
        for (int value : array) {
            System.out.println(value);
        }
    }
}
