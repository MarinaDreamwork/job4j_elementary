package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println("Result of p = 4, k = 1, S = " + result);
    }
}
