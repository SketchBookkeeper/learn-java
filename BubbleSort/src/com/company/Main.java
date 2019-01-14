package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers.\r");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        while(true) {
            boolean sorted = true;

            for(int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int number1 = numbers[j];
                    int number2 = numbers[j + 1];

                    numbers[j] = number2;
                    numbers[j + 1] = number1;

                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }

        for(int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }
}
