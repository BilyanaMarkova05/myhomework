package com.company;

import java.util.Scanner;

public class absoluteValueOfX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = n - 21");
        System.out.print("n = ");
        int n = scanner.nextInt();
        int x = n - 21;
        if (x > 0 && x < 21){
            System.out.println(x);
        }else if(x < 0){
            System.out.println(-x);
        }else if(x > 21){
            System.out.println(x * 2);
        }
    }
}



