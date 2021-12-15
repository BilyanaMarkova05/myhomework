package com.company;

import java.util.Scanner;

public class absoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean absoluteValue = x > 0 || x < 0;
        System.out.println(absoluteValue ? x : -x);




    }
}
