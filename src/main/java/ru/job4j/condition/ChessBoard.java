package ru.job4j.condition;

public class ChessBoard {

    public static  int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        boolean rightstep = (x == y);
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (rightstep) {
                rsl = Math.abs(x);
            } else {
                return rsl;
            }
        }
        return rsl;
    }

    public static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}