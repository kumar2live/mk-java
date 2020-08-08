package com.mkjava;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int loopMeWith = Math.abs(number);
        int originalNumber = loopMeWith;
        int numberReverse = 0;

        while (loopMeWith > 0) {
            int lastDigit = loopMeWith % 10;
            loopMeWith = loopMeWith / 10;
            numberReverse = (numberReverse * 10) + lastDigit;
        }

        return (originalNumber == numberReverse);
    }
}
