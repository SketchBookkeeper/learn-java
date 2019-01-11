package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 200, 100);

        Dog dog = new Dog("Spot", 50, 50, 2, 4);
        dog.eat();
    }
}
