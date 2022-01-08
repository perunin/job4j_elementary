package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        double debt = amount + (amount * percent);
        while (0 < debt) {
            amount = debt - salary;
            debt = amount + (amount * percent);
            year++;
        }
        return year;
    }
}
