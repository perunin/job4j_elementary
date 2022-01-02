package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConverter140rblThen2euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter180RbThen3Dlr() {
        float in = 180;
        float expected = 6;
        float out = Converter.rubleToDollar(in);
        double eps = 0.0001;
        Assert.assertEquals(expected, out, eps);
    }
}