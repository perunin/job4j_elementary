package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Pert Sidorov";
        names[2] = "Oleg Petrov";
        names[3] = "Vasiliy Vasin";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива " + ages.length);
        System.out.println("Размер массива " + surnames.length);
        System.out.println("Размер массива " + prices.length);
    }
}
