package com.company;

import java.util.Scanner;

public class blackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 21 && b > 21){
            System.out.println(0);
        }
        if ((21 - a) < (21 - b)){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
