package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages length: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames length: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices length: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivanov Ivan";
        names[1] = "Petrov Petr";
        names[2] = "Sidorov Anatolii";
        names[3] = "Trushina Marina";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
