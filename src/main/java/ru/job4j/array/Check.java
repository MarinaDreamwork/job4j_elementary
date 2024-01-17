package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            boolean standart = data[0];
            if (datum != standart) {
                return false;
            }
        }
            return result;
    }
}
