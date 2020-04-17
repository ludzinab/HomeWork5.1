package com.itacademy.lesson5;

public class HomeWork51 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 3, 5};

        printArray(values);
        System.out.println();
        printShiftedArray(values);

    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
    }

    public static void printShiftedArray(int[] values) {
        System.out.print(values[values.length - 1] + " ");
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i] + " ");
        }
    }

}
