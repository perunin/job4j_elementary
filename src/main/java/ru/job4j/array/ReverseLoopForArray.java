package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int index = 0; index < numbers.length; index++) {
            if ((numbers.length - 1 - index) % 2 == 0) {
                System.out.println("Current element array start with last: " + numbers[numbers.length - 1 - index]);
            }
        }
    }
}
