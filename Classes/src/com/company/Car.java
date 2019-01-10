package com.company;

public class Car {

    // Fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

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
