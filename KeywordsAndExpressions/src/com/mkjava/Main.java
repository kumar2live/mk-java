package com.mkjava;

public class Main {

    public static void main(String[] args) {
        int myInteger = 50;
        myInteger++;
        myInteger += 4;
        System.out.println(myInteger);

        System.out.println(calculateScore("One", 56));
        System.out.println(calculateScore("Two", 123));
    }

    public static int calculateScore(String message, int myIntValue) {
        int finalValue = 0;
        if (myIntValue > 50) {
            finalValue = myIntValue + 78;
        }

        return finalValue;
    }
}
