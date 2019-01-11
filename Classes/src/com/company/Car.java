package com.company;

public class Car {

    // Fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Constructor
    public Car() {
        // Calling another constructor within another
        // constructor. Must be first line in
        // constructor.
        this(4, 4); // Some Defaults.

        System.out.println("empty constructor");
    }

    // Constructors can be overloaded
    public Car(int doors, int wheels) {
        this.doors = doors;
        this.wheels = wheels;
    }

    // Setter
    public void setModel(String model) {

        // Field Validation
        String validModel = model.toLowerCase();

        if (validModel.equals("fiesta") || validModel.equals("F250")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    // Getter
    public String getModel() {
        return this.model;
    }
}
