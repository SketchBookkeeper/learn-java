package com.company;

public class Main {

    public static void main(String[] args) {
        hello();
        hello("World");
        hello(1);
    }

    // Method Overloading
    //
    // Methods can have the same name
    // if they have different number
    // of parameters or parameters
    // are of different data types.
    public static void hello() {
        System.out.println("Hello");
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void hello(int value) {
        System.out.println("Hello " + value);
    }

}
