package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenfirstMax() {
        int result = MultiMax.max(43, 4, 2);
        assertThat(result, is(43));
    }

    public void whenSecondMax() {
        int result = MultiMax.max(1, 78, 2);
        assertThat(result, is(78));
    }

    public void whenTherdMax() {
        int result = MultiMax.max(1, 4, 57);
        assertThat(result, is(57));
    }

    public void whenAllEqually() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}