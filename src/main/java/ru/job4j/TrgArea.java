package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        rsl = Math.sqrt(rsl * (rsl - a) * (rsl - b) * (rsl - c));
        return rsl;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
