package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl =  (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        short wheight = 160;
        double woman = Fit.womanWeight(wheight);
        System.out.println("175 is " + man + " kg");
        System.out.println("160 is " + woman + " kg");
    }
}
