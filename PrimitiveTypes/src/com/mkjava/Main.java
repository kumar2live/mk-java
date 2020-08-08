package com.mkjava;

@SuppressWarnings("ConstantConditions")
public class Main {

    public static void main(String[] args) {
        int result = 1;
        System.out.println(result);
        // Abbreviating Operators
        result++;
        result += 6;
        result--;
        System.out.println(result);

        boolean isWorking = true;
        if (isWorking != true) {
            System.out.println("It;s true");
        } else {
            System.out.println("It's not working");
        }

        int age = 30;
        int spouseAge = 28;
        if (age > 28 && spouseAge == 28) {
            System.out.println("Old now");
        }

        int anotherNumber = 50;
        if (anotherNumber == 50) {
            System.out.println(anotherNumber);
        }

        boolean isThisOK = false;
        if (isThisOK) {
            System.out.println(isThisOK);
        }
        System.out.println(isThisOK ? "This is okay" : "This is not okay");

        double doubleOne = 20.00;
        double doubleTwo = 80.00;
        double doubleTotal = (doubleOne + doubleTwo) * 100.00d;
        System.out.println(doubleTotal);
        double theReminder = doubleTotal % 40.00d;
        System.out.println(theReminder);
        System.out.println(theReminder == 0);
        if (theReminder != 0) {
            System.out.println("theReminder != 0");
        }

//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//
//        System.out.println("Float max value " + (Float.MAX_VALUE));
//        System.out.println(Float.MIN_VALUE);
//
//        int myIntValue = 5 / 2;
//        float myFloatValue = 5f / 3f;
//        double myDoubleValue = 5.00 / 3.00;
//
//        System.out.println(myIntValue);
//        System.out.println(myFloatValue);
//        System.out.println(myDoubleValue);
//
//        double numberOfPounds = 100d;
//        double convertedToKG = numberOfPounds * 0.45359237d;
//        System.out.println(convertedToKG);
//
//        char myChar = 'D';
//        char myUnicode = '\u0b94';
//        System.out.println(myChar);
//        System.out.println(myUnicode);
//
//        boolean isItTrue = !false;
//        System.out.println(isItTrue);
//
//        // These are primitive data types
//        // byte
//        // short
//        // int
//        // long
//        // float
//        // double
//        // char
//        // boolean
//
//        String myString = "This is a string ";
//        myString = myString + "\u00a9 2020";
//        System.out.println(myString + (myString));
//
//        String numberString = "340.90";
//        int someNumber = 1234;
//        System.out.println(numberString + (someNumber));
    }
}
