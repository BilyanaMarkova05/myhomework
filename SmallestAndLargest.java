package com.company;

import java.util.Scanner;

public class SmallestAndLargest {

    public static void main(String[] args) {
        int largest = 1;
        int smallest = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }
}
