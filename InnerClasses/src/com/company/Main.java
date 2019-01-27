package com.company;

public class Main {

    public static void main(String[] args) {
        Gearbox car = new Gearbox(6);
        // Declare a inner class
        Gearbox.Gear first = car.new Gear(1, 12.3);
    }
}
