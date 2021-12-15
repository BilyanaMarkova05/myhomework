package com.company;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isYearLeap(year));
    }
    public static String isYearLeap(int year){
        if (year % 4 == 0){
            return year + " is leap year";
        }else if (year % 100 == 0) {
            return year + " is not leap year";
        }else if (year % 400 == 0 ){
            return year + " is leap year";
        }
        return year + " is not leap year";
    }
}