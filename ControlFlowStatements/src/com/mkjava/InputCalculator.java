package com.mkjava;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        if (count > 0) {
            avg = Math.round(sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
