package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String expected = "See you later.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenUnknownAnswerBot() {
        String input = "How are you doing?";
        String expected = "I don't know. Please, ask another question.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }
}