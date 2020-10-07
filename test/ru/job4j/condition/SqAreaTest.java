package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square1() {
         int expected = 2;
         int p = 18;
        double out = SqArea.sqArea(p, 6);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int expected = 6;
        int k = 6;
        double out = SqArea.sqArea(19, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}