package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && ab + ac > bc && bc + ac > ab;
    }
}
