package com.mkjava;

public class TeenNumberChecker {

    public static boolean hasTeen (int param1, int param2, int param3) {
        if (isTeen(param1) || isTeen(param2) || isTeen(param3) ) {
            return true;
        }

        return false;
    }

    public static boolean isTeen (int param1) {
        if (param1 > 12 && param1 < 20) {
            return true;
        }

        return false;
    }
}
