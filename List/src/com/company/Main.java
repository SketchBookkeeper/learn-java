package com.company;

import java.util.ArrayList;

public class Main {
    // Setup an ArrayList
    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        addtoList("Milk");
        addtoList("Bread");
        addtoList("Butter");
        addtoList("Cream Cheese");
        printList();

        modifyItem(0, "Almond Milk");
        printList();

        removeItem(2);
        printList();
    }

    // Add
    public static void addtoList(String item) {
        list.add(item);
    }

    // Update
    public static void modifyItem(int position, String newItem) {
        list.set(position, newItem);
    }

    // Remove
    public static void removeItem(int position) {
        list.remove(position);
    }

    public static void printList() {
        System.out.println("You have " + list.size() + " items in the list.");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
