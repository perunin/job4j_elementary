package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        //System.out.println("area (2, 2, 2) = " + result);
        System.out.println("area (2, 2, 3) = " + result);
    }
}
