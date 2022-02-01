package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " $.");
        float in = 180;
        float excpected = 3;
        float out = Converter.rubleToDollar(in);
        boolean passed = excpected == out;
        System.out.println("180 rubles are " + out + passed);
        in = 140;
        excpected = 2;
        out = Converter.rubleToEuro(in);
        passed = excpected == out;
        System.out.println("140 euro are " + out + passed);
    }
}
