package ru.job4j.array;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'X', ' ', 'X', 'X'},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }
}