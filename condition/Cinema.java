package ru.job4j.condition;

public class Cinema {
    public static void acces(int age) {
        System.out.println("The age of the customers is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.acces(21);
        Cinema.acces(16);
        Cinema.acces(18);
    }
}
