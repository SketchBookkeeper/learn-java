package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.DOWN);

        String num1String = df.format(num1);
        String num2String = df.format(num2);

        System.out.println(num1String);
        System.out.println(num2String);

        if (num1String.equals(num2String)) {
            return true;
        } else {
            return false;
        }
    }
}
