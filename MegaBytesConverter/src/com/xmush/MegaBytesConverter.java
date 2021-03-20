package com.xmush;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if(kiloBytes < 0) {

            System.out.println("Invalid Value");

        } else {

            int megaByte = (int) (kiloBytes - (kiloBytes % 1024))/1024;

            int extraKiloByte = kiloBytes % 1024;

            String message = kiloBytes + " KB = " +megaByte + " MB and " + extraKiloByte + " KB";

            System.out.println(message);

        }

    }

}
