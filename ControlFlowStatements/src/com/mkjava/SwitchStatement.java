package com.mkjava;

public class SwitchStatement {
    public static void printNumber(int num) {
        switch (num) {
            case 1:
                System.out.println("Printing case 1: " + num);
                break;
            case 2:
                System.out.println("Printing case 2: " + num);
                break;
            case 3: case 4:
                System.out.println("Printing case 3/4: " + num);
                break;
            default:
                System.out.println("Printing default:" + num);
                break;
        }
    }

    public static void printChar(char character) {
        switch (character) {
            case 'A':
                System.out.println("Printing case A: " + character);
                break;
            case 'B':
                System.out.println("Printing case B: " + character);
                break;
            case 'C': case 'D':
                System.out.println("Printing case C/D: " + character);
                break;
            default:
                System.out.println("Printing default: " + character);
                break;
        }
    }

    public static void printString(String month) {
        String m = month.toLowerCase();
        switch (m) {
            case "jan":
                System.out.println("Printing case Jan: " + month);
                break;
            case "feb":
                System.out.println("Printing case Feb: " + month);
                break;
            case "mar": case "apr":
                System.out.println("Printing case Mar/Apr: " + month);
                break;
            default:
                System.out.println("Printing default: " + month);
                break;
        }
    }

    public static void printDayOfTheWeek(int dayInNumber) {
        switch (dayInNumber) {
            case 1:
                System.out.println("Printing case: " + dayInNumber + " Sunday");
                break;
            case 2:
                System.out.println("Printing case: " + dayInNumber + " Monday");
                break;
            case 3:case 4:case 5:case 6:case 7:
                System.out.println("Printing case: " + dayInNumber + " Tuesday to Saturday");
                break;
            default:
                System.out.println("Printing default: " + "Not a valid day");
                break;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year < 1 || year > 9999) || (month < 1 || month > 12)) {
            return -1;
        }

        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 30;
        }
    }
}
