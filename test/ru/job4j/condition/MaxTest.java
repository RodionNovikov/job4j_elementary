package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void getMaxOftwo() {
      assertThat(second, Max.max(1, 7));
    }

    @Test
    public void getMaxOfthree() {
        assertThat(first, Max.max(12, 5, 3));
    }

    @Test
    public void getMaxOfFour() {
        assertTrue(fourth, Max.max(8, 5, 6, 9));
    }
}