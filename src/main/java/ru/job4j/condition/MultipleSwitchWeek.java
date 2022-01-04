package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {

       return switch (name) {
            case "понедельник", "Monday" -> 1;
            case "вторник", "Thuesday" -> 2;
            case "среда", "Wednesday" -> 3;
            case "четверг", "Thursday" -> 4;
            case "пятница", "Friday" -> 5;
            case "суббота", "Saturday" -> 6;
            case "воскресенье", "Sunday" -> 7;
           default -> -1;
       };
    }
}
