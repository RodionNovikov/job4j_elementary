package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {
    @Test
    public void whenMan189ThenWeight102() {
        short in = 189;
        double exprcted = 102;
        double out = Fit.manWeight(in);
        Assert.assertEquals(exprcted, out, 0.5);
    }

    @Test
    public void whenWoman184ThenWeight85() {
        short in = 184;
        double expected = 85;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.5);
    }
}