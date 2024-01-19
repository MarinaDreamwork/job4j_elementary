package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {3, 2}, {6, 5, 4}, {10, 9, 8, 7} };
        for (int[] elem : array) {
            System.out.println(elem.length);
        }
    }
}
