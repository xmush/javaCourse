package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myInteger = 10000;

        int myMinInteger = Integer.MIN_VALUE;
        int myMaxInteger = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = "+ myMinInteger);
        System.out.println("Integer Minimum Value = "+ myMaxInteger);

        byte myByteMin = Byte.MIN_VALUE;
        byte myByteMax = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " +myByteMin);
        System.out.println("Byte Maximum Value = "+myByteMax);

        short myShortMin = Short.MIN_VALUE;
        short myShortMax = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " +myShortMin);
        System.out.println("Short Maximum Value = "+myShortMax);

        long myLongMin = Long.MIN_VALUE;
        long myLongMax = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = "+ myLongMin);
        System.out.println("Long Maximum Value = "+ myLongMax);

        int myNewByteValue = (myByteMin/23);

        System.out.println(myNewByteValue);

        
    }
}
