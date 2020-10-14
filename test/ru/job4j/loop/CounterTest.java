package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void thenSumOfNumbersFromOneToTenThenTherty() {
        int rls = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rls, is(expected));
    }

    @Test
    public void thenSumOfNumbersFromThreeToEightThenEighteen() {
        int rls = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rls, is(expected));
    }
}