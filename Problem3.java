package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(isNum1DividedByAccuracy(num1, num2, num3));
    }
    public static boolean isNum1DividedByAccuracy(int num1, int num2, int num3){
        if(num1 % num2 == 0 && num1 % num3 == 0){
            return true;
        }
        return false;
    }
}
