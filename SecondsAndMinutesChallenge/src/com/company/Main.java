package com.company;

/*
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return Invalid value in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format ÅgXXh YYm ZZsÅh where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return Invalid value if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.

Tips:
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus:
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge
 */

public class Main {

    public static void main(String[] args) {
        getDurationString(30, 13);
        getDurationString(3600);
        getDurationString(61,0);
    }

    public static int getDurationString(int minutes, int seconds) {
        if (minutes <= 0 || seconds >= 60 || seconds < 0 ) {
            System.out.println("Invalid value");
            return -1;
        }

        String formattedHours = String.format("%02d",minutes / 60);
        String formattedMinutes = String.format("%02d",minutes % 60);
        String formattedSeconds = String.format("%02d", seconds);

        System.out.println(formattedHours + "h" + formattedMinutes + "m" + formattedSeconds + "s");

        return 1;
    }

    public static int getDurationString(int seconds) {
        if (seconds <= 0 ) {
            System.out.println("Invalid value");
            return -1;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        getDurationString(minutes, seconds);

        return 1;
    }

}
