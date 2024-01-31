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

    @Test
    void whenMax1To2To3Then3() {
        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int output = Max.max(input1, input2, input3);
        int expected = 3;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax5To1To8Then8() {
        int input1 = 5;
        int input2 = 1;
        int input3 = 8;
        int output = Max.max(input1, input2, input3);
        int expected = 8;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax51To6To8Then51() {
        int input1 = 51;
        int input2 = 6;
        int input3 = 8;
        int output = Max.max(input1, input2, input3);
        int expected = 51;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int input4 = 4;
        int output = Max.max(input1, input2, input3, input4);
        int expected = 4;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax10To2To31To4Then31() {
        int input1 = 10;
        int input2 = 2;
        int input3 = 31;
        int input4 = 4;
        int output = Max.max(input1, input2, input3, input4);
        int expected = 31;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax18To2To5To2Then18() {
        int input1 = 18;
        int input2 = 2;
        int input3 = 5;
        int input4 = 2;
        int output = Max.max(input1, input2, input3, input4);
        int expected = 18;
        assertThat(output).isEqualTo(expected);
    }
}