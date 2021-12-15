package com.company;

import java.util.Scanner;

public class bonusPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        if (points >= 1 && points <= 3) {
            System.out.println(points * 10);
        } else if (points >= 4 && points <= 6) {
            System.out.println(points * 100);
        } else if (points >= 7 && points <= 9) {
            System.out.println(points * 1000);
        } else if (points == 0 || points > 9) {
            System.out.println("Грешка");
        }
    }
}