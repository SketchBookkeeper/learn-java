package com.company;

import java.util.ArrayList;

public class Main {
    // Setup an ArrayList
    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        addToList("Milk");
        addToList("Bread");
        addToList("Butter");
        addToList("Cream Cheese");
        printList();

        modifyItem(0, "Almond Milk");
        printList();

        removeItem(2);
        printList();

        System.out.println(findItem("Bread"));
    }

    // Add
    public static void addToList(String item) {
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

    // Find
    public static String findItem(String searchItem) {
        // boolean exists = list.contains(searchItem);

        int position = list.indexOf(searchItem);

        if (position >= 0) {
            return list.get(position);
        }

        return null;
    }

    // Print the list
    public static void printList() {
        System.out.println("You have " + list.size() + " items in the list.");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
