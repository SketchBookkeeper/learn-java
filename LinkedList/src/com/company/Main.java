package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Telluride");
        placesToVisit.add("Moab");
        placesToVisit.add("Denver");
        placesToVisit.add("Canada");
        printList(placesToVisit);

        placesToVisit.add(1, "Iceland");
        printList(placesToVisit);

        placesToVisit.remove(3);
        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("=======");
    }
}
