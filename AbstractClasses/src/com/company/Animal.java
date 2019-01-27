package com.company;

// Abstract classes differ from interfaces in
// that an abstract class can define methods
// and fields that have functionality and
// can be inherited by sub classes.

// Abstract classes cannot be instanced, only extended.
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
