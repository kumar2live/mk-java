package com.mkjava;

public class StrToNumber {
    public static void practice() {
        String numberAsString = "1048";
        System.out.println(numberAsString + 1);

        int number = Integer.parseInt(numberAsString);
        System.out.println(number + 1);

        double number2 = Double.parseDouble("1048.34");
        System.out.println(number2);

        System.out.println(Long.parseLong("121312"));
    }
}
