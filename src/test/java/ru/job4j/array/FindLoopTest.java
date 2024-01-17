package ru.job4j.array;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot18ThenMinus1() {
        int[] data = new int[] {4, 19, 71, 108};
        int elementToFind = 18;
        int output = FindLoop.indexOf(data, elementToFind);
        int expected = -1;
        assertThat(output).isEqualTo(expected);
    }

}