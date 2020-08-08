package com.mkjava;

import java.util.Scanner;

public class ReadingUserInput {
    public static void practice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;
            System.out.println("Your name is: " + name + " and your age " + age);
        } else {
            System.out.println("Something's not right!");
        }
        scanner.close();
    }

    public static void sumUserInput() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(counter < 3) {
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid entry!");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println(sum);
    }
}
