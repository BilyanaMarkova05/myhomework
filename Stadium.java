package com.company;

public class Stadium {

    public static void main(String[] args) {
            int capacity = 25000;
            boolean hasLights = true;
            boolean getLicense = hasLights || capacity > 35000;
            String result = getLicense ? "Има" : "Няма";
            System.out.println(result);



    }
}
