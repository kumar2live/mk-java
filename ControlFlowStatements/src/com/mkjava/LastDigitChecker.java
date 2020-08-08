package com.mkjava;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int param1, int param2, int param3) {
        if (isValid(param1) && isValid(param2) && isValid(param3))
            return ((param1 % 10 == param2 % 10) || (param1 % 10 == param3 % 10) || (param2 % 10 == param3 % 10));

        return false;
    }

    public static boolean isValid(int param) {
        return (param >= 10 && param <= 1000);
    }
}
