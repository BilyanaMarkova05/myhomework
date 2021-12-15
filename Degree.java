package com.company;

import java.util.Scanner;

public class Degree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int degree = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= degree){
            result = result * inputNum;
            i++;
        }
        System.out.println(result);
    }
}
