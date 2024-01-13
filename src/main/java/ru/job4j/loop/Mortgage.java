package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double percentAmount = amount * (percent / 100);
        double restToPay = amount + percentAmount;
        while (restToPay > 0) {
            year += 1;
            restToPay -= salary;
        }
        return year;
    }
}
