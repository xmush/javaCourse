package com.xmush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double varD = 20.00;
        double varD2 = 80.00;

        double varD3 = varD + varD2 * 100;

        System.out.println("My total double : "+ varD3);
        double theReminder = varD3 % 40.00d;
        System.out.println("My reminder : "+ theReminder);

        boolean isNewReminder = (theReminder == 0) ? true : false;

        System.out.println("Is the new Reminder : "+isNewReminder);

        if(!isNewReminder) {
            System.out.println("reminder false");
        }


    }
}
