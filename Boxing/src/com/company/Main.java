package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList cannot accept primitive data types, only classes.
        // ArrayList<int> intList = new ArrayList<int>(); // Will not work.

        // Integer is a wrapper class or "Boxing".
        Integer integer = new Integer(44);
        Double doubleNumber = new Double(3.333);

        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            // Autoboxing
            // Put a primitive into a wrapper class/
            intList.add(Integer.valueOf(i));
        }

        // Unboxing
        // getting the primitive value from
        // the wrapper class.
        System.out.println(intList.get(0).intValue());

        // The short way
        Integer myValue = 67;
        // Compiler will convert this to
        // Integer myValue = new Integer.valueOf(67);

        int myInt = myValue;
        // Assignment will convert to this
        // myValue.intValue();
    }
}
