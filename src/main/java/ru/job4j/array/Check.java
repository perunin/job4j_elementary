package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[data.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}
