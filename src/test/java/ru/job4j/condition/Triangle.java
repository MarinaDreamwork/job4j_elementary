package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        System.out.println("is triangle exist with the sides: 4, 5, 6: " + exist(4.0, 5.0, 6.0));
    }
}
