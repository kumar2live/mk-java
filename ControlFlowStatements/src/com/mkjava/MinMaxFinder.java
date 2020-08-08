package com.mkjava;

import java.util.Scanner;

public class MinMaxFinder {
    public static void findMinMax() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;
        int count = 0;
        System.out.println(Integer.MAX_VALUE);

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        scanner.close();
    }
}
