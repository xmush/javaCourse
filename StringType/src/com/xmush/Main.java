package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "This is a string";

        System.out.println("This is equals to : " + myString);

        myString = myString + ", add comma";

        System.out.println("This is equals to : " + myString);

        myString = myString + ", \u00A9 2021";

        System.out.println("This is equals to : " + myString);
    }
}
