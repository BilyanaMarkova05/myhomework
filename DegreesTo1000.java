package com.company;

import java.util.Scanner;

public class DegreesTo1000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int result = 1;
        while(result < 1000){
            result *= inputNum;
            if(result < 1000) {
                System.out.println(result);
            }
        }
    }
}
