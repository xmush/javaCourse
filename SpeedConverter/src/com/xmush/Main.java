package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0);

    }

    public static long toMilesPerHour (Double kiloMetersPerHours) {

        long result = -1l;

        if(kiloMetersPerHours >= 0) {

            result = (long) Math.round(kiloMetersPerHours / 1.609);

        }

        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
