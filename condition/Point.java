package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {

        double result = Point.distance(0, 0, 2, 2);
        double result2 = Point.distance(3, 3, 3, 2);
        System.out.println(result);
        System.out.println(result2);
    }
}

