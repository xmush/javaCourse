package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Min Double : " +myMinDouble);
        System.out.println("Max Double : " +myMaxDouble);
        System.out.println("Min Float : " + myMinFloat);
        System.out.println("Max Float : " + myMaxFloat);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5f / 3;

        System.out.println("Integer value : " + myIntValue);
        System.out.println("Float value : " + myFloatValue);
        System.out.println("Double value : " + myDoubleValue);

        double numPounds = 200d;
        double convertKg = numPounds * 0.45359237d;

        System.out.println("Converted Kilogram : " + convertKg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println("Value of phi : " + pi);
        System.out.println("Value of anotherNumber : " + anotherNumber);



    }
}
