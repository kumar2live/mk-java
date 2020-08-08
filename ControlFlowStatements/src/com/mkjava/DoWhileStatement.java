package com.mkjava;

public class DoWhileStatement {
    public static void SampleWhile() {
        int count = 1;

        while (count != 8) {
            System.out.println("Count: " + count);
            count++;

            if (count == 5) {
                break;
            }
        }

        count = 0;
        int evenNumbers = 0;
        int sum = 0;
        do {
            count++;
            if (!isEvenNumber(count)) {
                continue;
            }

            evenNumbers++;
            sum += count;

            if (evenNumbers == 5) break;
        } while (count != 26);

        System.out.println("The SUM: " + sum);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
