package com.mkjava;

public class MethodOverloadingSample {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println("Feet " + feet + " inches " + inches + " centimeters " + centimeters + "cm");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remaining = (int) inches % 12;
        System.out.println(inches + " inches " + feet + " feet and remaining " + remaining + " inches");
        return calcFeetAndInchesToCentimeters(feet, remaining);
    }

    public static int calculateScore(String player, int score) {
        System.out.println("Player name: " + player + " secured " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player name: secured " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name: secured no score" );
        return 0;
    }
}
