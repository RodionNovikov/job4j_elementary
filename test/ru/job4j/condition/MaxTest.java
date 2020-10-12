package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void thenMaxFirtsToSecond() {
        int result = Max.max(17, 6);
        assertThat(result, is(17));
    }

    @Test
    public void thenFirstToMaxSecond() {
        int result = Max.max(8, 23);
        assertThat(result, is(23));
    }

    @Test
    public void thenFirstEquSecond() {
        int result = Max.max(28, 28);
        assertThat(result, is(28));

    }
}