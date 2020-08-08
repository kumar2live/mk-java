package com.mkjava;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = number % 10;
        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;
        }
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEven = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) sumOfEven += lastDigit;
            number = number / 10;
        }
        return sumOfEven;
    }
}
