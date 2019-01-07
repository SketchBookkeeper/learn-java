package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,34));
        System.out.println(hasTeen(9,99,19));
    }

    public static boolean hasTeen(int... values) {
        for(int i : values) {
            if (i >= 13 && i <= 19) {
                return true;
            }
        }

        return false;
    }
}
