package com.company;

public class HealthyBurger extends Burger {
    public HealthyBurger(String meat, double price) {
        super("Brown rye bread roll", meat, price);

        this.setMaxAdditions(2);
    }
}
