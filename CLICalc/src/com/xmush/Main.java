package com.xmush;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean condition = true;

        while (condition) {
            char menu = showMenu();

            switch (menu) {
                case '1' : {
                    int[] userIn = getUserInput();
                    int var1 = userIn[0];
                    int var2 = userIn[1];

                    int hasilTambah = sumNumber(var1, var2);
                    System.out.println("Hasil penjumlahan adalah : " + hasilTambah);

                } break;
                case '2' : {
                    int[] userIn = getUserInput();
                    int var1 = userIn[0];
                    int var2 = userIn[1];

                    int hasilKali = multiplyNumber(var1, var2);
                    System.out.println("Hasil perkalian adalah : "+ hasilKali);

                }break;
                case '3' : {
                    int[] userIn = getUserInput();
                    int var1 = userIn[0];
                    int var2 = userIn[1];

                    int hasilKurang = subtractNumber(var1, var2);
                    System.out.println("Hasil pengurangan adalah : " + hasilKurang);
                } break;
                case '4' : {
                    int[] userIn = getUserInput();
                    int var1 = userIn[0];
                    int var2 = userIn[1];

                    float hasilBagi = dividedNumber(var1, var2);
                    System.out.println("Hasil pembagian adalah : " + hasilBagi);
                } break;
                case '5' : {
                    System.out.println("Good bye...");
                    condition = false;
                    System.exit(1);
                }
                default:
                    System.out.println("Inputan tidak di pahami. masukan menu yang valid!!");
            }

        }
//        System.out.println(userIn[0]);
    }

    static char showMenu() {
        System.out.println(":::::::::::: MENU ::::::::::::");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian}");
        System.out.println("5. Exit}");

        System.out.println("Masukan Menu pilihan : ");

        Scanner scan = new Scanner(System.in);

        char menu = (char)scan.next().trim().charAt(0);

        return menu;
    }

    static int[] getUserInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number 1 : ");
        int var1 = scan.nextInt();

        System.out.print("Input number 2 : ");
        int var2 = scan.nextInt();

        int[] userInput = new int[2];

        userInput[0] = var1;
        userInput[1] = var2;

        return userInput;
    }

    static int sumNumber(int var1, int var2) {
        int total = var1 + var2;
        return total;
    }

    static int multiplyNumber(int var1, int var2) {
        int total = var1 * var2;
        return total;
    }

    static float dividedNumber(int var1, int var2) {
        float total = var1 / var2;
        return total;
    }

    static int subtractNumber(int var1, int var2) {
        int total = var1 - var2;
        return total;
    }
}
