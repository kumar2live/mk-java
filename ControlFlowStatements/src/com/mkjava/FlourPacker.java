package com.mkjava;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;

        int sum = (bigCount * 5) + (smallCount * 1);
        if ((sum == goal)) return true;

        if (smallCount != 0 && ((bigCount * 5) + (smallCount - 1) * 1) == goal) {
            return true;
        }

        return false;
    }
}
