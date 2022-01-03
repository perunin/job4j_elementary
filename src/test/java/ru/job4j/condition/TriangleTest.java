package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void whendoesnotExist() {
        double ab = 2.0;
        double ac = 0.5;
        double bc = 0.5;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}