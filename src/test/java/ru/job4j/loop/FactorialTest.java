package ru.job4j.loop;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void whenFactorial5Then120() {
        int input = 5;
        int output = Factorial.calculate(input);
        int expected = 120;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenFactorial0Then1() {
        int input = 0;
        int output = Factorial.calculate(input);
        int expected = 1;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenFactorial1Then1() {
        int input = 1;
        int output = Factorial.calculate(input);
        int expected = 1;
        assertThat(expected).isEqualTo(output);
    }

}