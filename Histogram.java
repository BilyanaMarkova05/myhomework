package com.company;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digitA = n / 10000;
        int digitB = (n / 1000) % 10;
        int digitC = (n / 100) % 10;
        int digitD = (n / 10) % 10;
        int digitE = n % 10;

        if (n >= 100 && n < 999) {
            System.out.print(digitC);
            for (int i = 0; i < digitC; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 0; i < digitD; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 0; i < digitE; i++) {
                System.out.print("*");
            }
        } else if (n >= 100 && n < 9999) {
            System.out.println();
            System.out.print(digitB);
            for (int i = 0; i <  digitB; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitC);
            for (int i = 0; i < digitC; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 0; i < digitD; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 0; i < digitE; i++) {
                System.out.print("*");
            }
        } else if (n >= 100 && n < 30000){
            System.out.println(digitA);
            for (int i = 0; i < digitA ; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitB);
            for (int i = 0; i < digitB ; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitC);
            for (int i = 0; i < digitC ; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 0; i < digitD ; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 0; i < digitE ; i++) {
                System.out.print("*");
            }
        }
    }
}
