package ru.job4j.calculator;

public class Calculator {
    public static void plus(int firstArgument, int secondArgument) {
        int result = firstArgument + secondArgument;
        System.out.println(result);
    }

    public static void minus(int firstArgument, int secondArgument) {
        int result = firstArgument - secondArgument;
        System.out.println(result);
    }

    public static void main(String[] args) {
       plus(100, 500);
       plus(4, 2);
       plus(3, 5);
       minus(7, 3);
    }
}
