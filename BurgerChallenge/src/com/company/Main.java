package com.company;

public class Main {

    public static void main(String[] args) {
        DeluxeBurger deluxeBurger = new DeluxeBurger("White Bread", "Beef", 3.00);
        deluxeBurger.showTotal();

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 7.00);
        healthyBurger.addAddition(new Chips(1.33));
        healthyBurger.showTotal();
    }
}
