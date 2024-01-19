package ru.job4j.array;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortSelectedTest {
    @Test
    public void whenSort5ThenTrue() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3ThenTrue() {
        int[] data = new int[] {8, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 8};
        assertThat(result).containsExactly(expected);
    }
}