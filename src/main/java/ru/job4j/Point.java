package ru.job4j;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double two = y2 - y1;
        first = Math.pow(first, 2);
        two = Math.pow(two, 2);
        double rsl = Math.sqrt(first + two);
        return rsl;
    }

    public static void main(String[] args) {

        double result = Point.distance(0, 0, 2, 2);
        double result2 = Point.distance(3, 3, 3, 2);
        System.out.println(result);
        System.out.println(result2);
    }
}

