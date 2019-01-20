package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Moab");
        addInOrder(placesToVisit, "Telluride");
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Canada");
//        printList(placesToVisit);

//        placesToVisit.add(1, "Iceland");
//        printList(placesToVisit);
//
//        placesToVisit.remove(3);
//        printList(placesToVisit);

        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=======");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add new city
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                // newCity should be before current item
                // .next() was called before, we need to go back
                // and add newCity before the next entry.

                // Java LinkedList is a double LinkedList
                // So we are able to move forward and backwards in the list.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                // move on to next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cites) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean movingForward = true; // Track direction
        ListIterator<String> listIterator = cites.listIterator();

        if (cites.isEmpty()) {
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next() + "\n");
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    // Change direction
                    if (!movingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        movingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        movingForward = false;
                    }
                    break;
                case 2:
                    if (movingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        movingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached the beginning of the list.");
                        movingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Actions:");
        System.out.println("0 - quit \n" +
                "1 - Visit next city \n" +
                "2 - Visit previous city \n" +
                "3 - show actions \n");
    }
}
