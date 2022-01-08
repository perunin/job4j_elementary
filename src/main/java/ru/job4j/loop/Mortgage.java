package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        while (0 < (amount + (amount * percent))) {
            amount = (amount + (amount * percent)) - salary;
            year++;
        }
        return year;
    }
}
