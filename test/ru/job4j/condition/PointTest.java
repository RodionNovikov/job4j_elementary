package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when54to108thenDistance3() {
        int x1 = 5;
        int y1 = 4;
        int x2 = 10;
        int y2 = 8;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when74to195thenDistance11() {
        int x1 = 7;
        int y1 = 4;
        int x2 = 19;
        int y2 = 5;
        int expected = 11;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.96);
    }

    @Test
    public void when12to34thenDistance3() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 9;
        int y2 = 4;
        int expected = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.8);
    }
}