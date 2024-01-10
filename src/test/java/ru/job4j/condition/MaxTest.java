package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int input1 = 1;
        int input2 = 2;
        int output = Max.max(input1, input2);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax8To5Then8() {
        int input1 = 8;
        int input2 = 5;
        int output = Max.max(input1, input2);
        int expected = 8;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax6To6Then6() {
        int input = 6;
        int output = Max.max(input, input);
        int expected = 6;
        assertThat(output).isEqualTo(expected);
    }
}