package com.xmush;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if(barking) {
            if(hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
