package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Methods and fields defined as abstract
    // must be have override in sub class
    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }
}
