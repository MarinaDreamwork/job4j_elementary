package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
class ConverterTest {

    @Test
    void whenConvert297RubTo3Euro() {
        float input = 297;
        float expected = 3;
        float output = Converter.roubleToEuro(input);
        float value = 0.00001F;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert450RubTo5Dollar() {
        float input = 450;
        float expected = 5;
        float output = Converter.roubleToDollar(input);
        float value = 0.00001F;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}