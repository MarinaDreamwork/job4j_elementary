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

        float input = 297;
        float expected = 3;
        float output = roubleToEuro(input);
        boolean isPassed = expected == output;
        System.out.println("297 rubles. It should be equal to 3. Test result is " + isPassed);

        input = 450;
        expected = 5;
        output = roubleToDollar(input);
        isPassed = expected == output;
        System.out.println("450 rubles. It should be equal to 5. Test result is " + isPassed);

    }
}
