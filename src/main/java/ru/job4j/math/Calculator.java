package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class Calculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumOfAllMathOperations(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разницы и деления " + differenceAndDivision(30, 20));
        System.out.println("Результат расчета всех математических операций " + sumOfAllMathOperations(20, 20));
    }
}
