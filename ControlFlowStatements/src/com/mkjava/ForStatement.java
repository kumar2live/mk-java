package com.mkjava;

public class ForStatement {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static void LoopMe() {
        for (int i=2; i < 9; i++) {
            System.out.println(
                    "Interest with : " + i + " is " +
                            String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
        System.out.println("----------------");
        for (int i=8; i >= 2; i--) {
            System.out.println(
                    "Interest with : " + i + " is " +
                        String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        int count = 0;
        for (int i=2; i < 50; i++) {
            if (i == 7) continue;

            if (isPrime(i)) count++;

            if (count == 5) break;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // faster i <= (long) Math.sqrt(n) instead of i <= n/2
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void sum2And5() {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 ==0)) {
                sum += i;
                count++;
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
