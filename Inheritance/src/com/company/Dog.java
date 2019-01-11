package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;

    public Dog(String name, int size, int weight, int eyes, int legs) {
        // Super, call constructor of class being extended.
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
    }

    private void chew() {
        System.out.println("Dog Chewed food");
    }

    // Override
    @Override
    public void eat() {
        this.chew();
        super.eat(); // Call class from parent.with super.
    }

    // If super keyword is omitted class will look
    // for method in own methods and call from parent
    // if not found.
    public void walk() {
        move(); // this will call Animal's move()
        // super.move(); // make parent class' move() method be called.
    }

    // @Override
    // public void move() {
        // this will be called by method above
        // if it's not commented out.
    // }
}
