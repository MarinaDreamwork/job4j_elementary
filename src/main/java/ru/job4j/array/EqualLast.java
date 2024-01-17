package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = left.length - 1; i < left.length; i++) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}
