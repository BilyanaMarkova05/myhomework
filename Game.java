package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(20) + 1;
        System.out.println("Guess the number: ");
        int i = 1;
        int myNum ;
        while (i < randomNum) {
            myNum = scanner.nextInt();
            if (myNum != randomNum){
            System.out.println("Guess another number: ");
            }
            i++;
        }
        myNum = scanner.nextInt();
        System.out.println("You guessed  right, " + myNum + " is the correct number");
        i++;
    }
}
