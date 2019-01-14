package com.company;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(String roll, String meat, double price) {
        super(roll,meat,price);

        this.setMaxAdditions(2);

        this.addAddition(new Chips(1.00));
        this.addAddition(new Drink(1.90));
    }
}
