package com.xmush;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double double1, double double2) {

        int doubleToInt1 = (int)(double1 * 1000);
        int doubleToInt2 = (int)(double2 * 1000);

        if(doubleToInt1 == doubleToInt2) {
            return true;
        }
        return false;


    }
}
