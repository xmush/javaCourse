package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here

        numberStatus(10);
        numberStatus(-10);
        numberStatus(0);

    }

    public static void numberStatus(int number) {

        if(number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero Number");
        }

    }
}
