package com.company;

public class DeskPhone implements ITelephone {
    @Override
    public void powerOn() {
        System.out.println("Phone is plugged in, always on.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling " + phoneNumber);
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
