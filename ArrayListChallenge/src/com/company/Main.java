package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    System.out.println("Options: " +
                "quit, print list, add new contact, " +
                "update contact, remove contact, search");

	    Contacts contactList = new Contacts();

        boolean run = true;

	    while(run) {
            System.out.println("Type a command:");

	        String command = scanner.nextLine();

            String name;
            String number;
            String newName;
            String newNumber;

            switch (command) {
                case "quit" :
                   run = false;
                   break;
                case "print list" :
                    contactList.printContacts();
                    break;
                case "add new contact" :
                    System.out.println("Enter Contact Name");
                    name = scanner.nextLine();

                    System.out.println("Enter Contact Phone number");
                    number = scanner.nextLine();

                    contactList.addContact(name, number);
                    break;
                case "update contact" :
                    System.out.println("Which contact do you want to update?");
                    name = scanner.nextLine();

                    System.out.println("Updated name:");
                    newName = scanner.nextLine();

                    System.out.println("Update number");
                    newNumber = scanner.nextLine();

                    contactList.updateContact(name, newName, newNumber);
                    break;
                case "remove contact" :
                    System.out.println("Which contact do you want to remove?");

                    contactList.removeContact(scanner.nextLine());
                    break;
                case "search" :
                    System.out.println("Enter full name of contact you want to find");

                    contactList.searchContacts(scanner.nextLine());
                    break;
                default:
                    System.out.println("That's not a valid command\r");
            }
        }

	    scanner.close();
    }
}
