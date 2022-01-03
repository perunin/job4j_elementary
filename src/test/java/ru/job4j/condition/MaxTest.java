package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void  whenMax99To99Then99() {
        int left = 99;
        int right = 99;
        int result = Max.max(left, right);
        int expected = 99;
        Assert.assertEquals(expected, result);
    }
}