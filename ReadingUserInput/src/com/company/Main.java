package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); // Handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Could not parse year of birth");
        }

        scanner.close();
    }

}
