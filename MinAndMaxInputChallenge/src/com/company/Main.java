package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxInt = 0;
        int minInt = 0;
        boolean firstLoop = true;

        while (true) {
            System.out.println("Enter number:");

            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("The Max is " + maxInt);
                System.out.println("The Min is " + minInt);
                break;
            }

            int number = scanner.nextInt();

            if (firstLoop) {
                maxInt = number;
                minInt = number;
                firstLoop = false;
            }

            if (number > maxInt) {
                maxInt = number;
            }

            if (number < minInt) {
                minInt = number;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
