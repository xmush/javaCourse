package com.xmush;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // initiating scanner
	    Scanner scan = new Scanner(System.in);

        System.out.print("Input the number : ");
	    int num = scan.nextInt();

	    if(num % 2 == 0) {
            System.out.println(num + " is not a prime number");
        } else {
	        if(num > 3) {
	            int divider = 0;
	            for(int i=3; i<num; i++) {
	                if(num % i == 0) {
                        divider++;
                    }
                }
	            if(divider > 0 ) {
                    System.out.println(num + " is not a prime number");
                } else {
                    System.out.println(num + " is a prime number");
                }
            } else {
                System.out.println(num + " is a prime number");
            }
        }


    }
}
