package ru.job4j.loop;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void whenStart5Finish8Then26() {
        int inputStart = 5;
        int inputFinish = 8;
        int output = Counter.sum(inputStart, inputFinish);
        int expected = 26;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenStart4Finish2Then0() {
        int inputStart = 4;
        int inputFinish = 2;
        int output = Counter.sum(inputStart, inputFinish);
        int expected = 0;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenStart10Finish10Then10() {
        int inputStart = 10;
        int inputFinish = 10;
        int output = Counter.sum(inputStart, inputFinish);
        int expected = 10;
        assertThat(expected).isEqualTo(output);
    }

}