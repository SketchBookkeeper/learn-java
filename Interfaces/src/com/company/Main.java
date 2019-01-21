package com.company;

public class Main {

    public static void main(String[] args) {
        // Sub classes can use an interface as the type
        // By doing this, objects of differing sub
        // classes can be exchanged with other sub
        // classes of the same interface. ... polymorphism
        ITelephone officePhone = new DeskPhone();
        ITelephone myPhone = new CellPhone();
    }
}
