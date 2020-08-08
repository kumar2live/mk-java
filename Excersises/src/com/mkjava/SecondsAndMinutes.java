package com.mkjava;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value(s)!";

    static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remaining = minutes % 60;

        return getZeroAdded("h", hours) + getZeroAdded("m", remaining) + getZeroAdded("s", seconds);
    }

    static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remaining = seconds % 60;

        return getDurationString(minutes, remaining);
    }

    static String getZeroAdded(String letter, long inputNum) {
        String outputString = inputNum + letter;
        return ((inputNum < 10) ? "0" + outputString : outputString) + " ";
    }
}
