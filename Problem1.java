package com.company;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        System.out.println(areSum1AndSum2Equal(num, num1));
    }
    public static int getSum1(int num){
        return num % 3;
    }
    public static int getSum2(int num1){
        return num1 % 3;
    }
    public static boolean areSum1AndSum2Equal(int getSum1, int getSum2){
        if(getSum1 == getSum2){
            return true;
        }
        return false;
    }
}
