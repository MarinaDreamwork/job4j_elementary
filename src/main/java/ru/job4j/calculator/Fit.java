package ru.job4j.calculator;

public class Fit {

    public static double manIdealWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanIdealWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double idealManWeight = manIdealWeight(height);
        System.out.println("Ideal weight of man's 187 cm height is " + idealManWeight);
        short myHeight = 173;
        double idealWomanWeight = womanIdealWeight(myHeight);
        System.out.println("Marina's ideal weight is " + idealWomanWeight);
    }
}
