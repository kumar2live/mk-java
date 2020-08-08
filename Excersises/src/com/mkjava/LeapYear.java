package com.mkjava;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        System.out.println(year);
        System.out.println(year % 4 == 0);
        System.out.println(year % 100 == 0);
        System.out.println(year % 400 == 0);
        if ((year % 4 == 0) && ((year % 100) % 2 == 0) && ((year % 400) % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
