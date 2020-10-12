package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DammyBotTest {

    @Test
    public void whenHiThenHi() {
        assertThat(
                DammyBot.answer("Привет, Бот."),
        is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DammyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DammyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}

