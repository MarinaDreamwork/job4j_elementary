package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[row].length; cell++) {
                if (row == 0) {
                    table[0][cell] = cell + 1;
                }
                if (cell == 0) {
                    table[row][0] = row + 1;
                }
                if ((row != 0) || (cell != 0)) {
                    table[row][cell] = table[0][cell] * table[row][0];
                }
            }
        }
        return table;
    }
}
