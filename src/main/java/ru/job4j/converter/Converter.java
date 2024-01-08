package ru.job4j.converter;

public class Converter {

    public static float roubleToEuro(float value) {
        return value / 99;
    }

    public static float roubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = roubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollarOfUsa = roubleToDollar(1000);
        System.out.println("1000 rubles are " + dollarOfUsa + " USA dollars.");
    }
}
