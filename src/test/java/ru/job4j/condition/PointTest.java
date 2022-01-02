package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to99then() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 9;
        int y2 = 9;
        double expected = 11.31;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to88then() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 8;
        int y2 = 8;
        double expected = 8.48;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when37to73then() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 7;
        int y2 = 7;
        double expected = 5.65;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}