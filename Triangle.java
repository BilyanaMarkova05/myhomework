package com.company;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i-1)*2 ; j++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}


