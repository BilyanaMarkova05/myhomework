package com.company;

import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int i = 2;
        int divider = 1;
        int sum = 0;
        while (i <= inputNum) {
            if (inputNum % i == 0) {
                divider = inputNum / i;
                sum = sum + divider;
            }
            i++;
        }
        if (sum == inputNum) {
            System.out.println("It is a perfect.");
        } else {
            System.out.println(inputNum + " is not perfect.");
        }
    }
}
