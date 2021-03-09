package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteVar = 10;
        int myIntVar = 20;
        short myShortVar = 100;

        int longTot =  (int) 2000 + 10 * (myByteVar + myIntVar + myShortVar);

        System.out.println("Long total : " + Short.MAX_VALUE);
        System.out.println("Long total : " + longTot);
    }
}
