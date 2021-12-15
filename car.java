package com.company;

public class car {

    public static void main(String[] args) {
	   int age = 4;
       float price = 60000;
       boolean highClass = age > 5 && price > 20000 || age <= 5 && price > 40000;
       String result = highClass ? "Yes" : "No";
       System.out.println(result);
    }
}
