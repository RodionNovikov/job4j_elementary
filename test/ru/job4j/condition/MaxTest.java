package ru.job4j.condition;


import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void getMaxOftwo() {
      assertThat(Max.max(1, 7), is(7));
    }

    @Test
    public void getMaxOfthree() {
        assertThat(Max.max(12, 5, 3), is(12));
    }

    @Test
    public void getMaxOfFour() {
        assertThat(Max.max(3, 7, 16, 18), is(18));
    }
}