package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PointTest {

    @Test
    public static void main(String[] args) {
       Point a = new Point(0, 0);
       Point b = new Point(0, 2);
       double dist = a.distance(b);
       System.out.println(dist);
       Point x = new Point(10, 12, 13);
       Point y = new Point(11, 14, 8);
       Point z = new Point(9, 2, 4);
       double distnce = x.distance3d(z);
       System.out.println(distnce);

    }
}

