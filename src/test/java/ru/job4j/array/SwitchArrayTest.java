package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 4, 3, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to7() {
        int[] input = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int source = 3;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 9, 6, 7, 8, 4, 10};
        Assert.assertArrayEquals(expected, result);
    }
}