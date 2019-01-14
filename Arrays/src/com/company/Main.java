package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray; // [] indicates this var will be an array.
        myIntArray = new int[10]; // Assign number of slots.
        myIntArray[0] = 50; // Put 50 in the first slot.
        System.out.println(myIntArray[0]);

        // Another way to init an array
        double[] myDoubleArray = {1, 3.33, 5.8, 0.99, -9};

        // Practice
        int[] testVales = getIntegers(3);

        for (int i = 0; i < testVales.length; i++) {
            System.out.println(testVales[i]);
        }

        System.out.println(getAverage(testVales));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }
 }
