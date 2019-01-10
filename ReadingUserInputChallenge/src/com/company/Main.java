package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number #" + count + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Please enter a valid number");
            }

            scanner.nextLine();
        }

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}
