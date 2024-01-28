package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {

        char symbol = input.charAt(0);
        String result = "";
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = result + symbol + (counter == 1 ? "" : counter);
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result + symbol + (counter == 1 ? "" : counter);
    }
}
