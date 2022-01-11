package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] post = {'l', 'l', 'o' };
        boolean result = EndWith.endWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndWith.endWith(word, post);
        Assert.assertFalse(result);
    }
}