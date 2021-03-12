package com.xmush;

public class SpeedConverter {
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
