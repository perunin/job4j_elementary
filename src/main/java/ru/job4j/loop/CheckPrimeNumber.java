package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else if (number == 2) {
            prime = true;
        }
        for (int index = 3; index <= number; index++) {
            if ((number % 2) == 0) {
                prime = false;
                break;
            } else if (((index % number) == 0) && ((index % 1) == 0)) {
                    prime = true;
                }
            } return prime;
    }
}
