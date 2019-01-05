package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKilosBytes(2050);
    }


    public static void printMegaBytesAndKilosBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        int mb = 1024;

        System.out.println(
            (kiloBytes / mb) + " MB " + (kiloBytes % mb) + " KB"
        );
    }

}
