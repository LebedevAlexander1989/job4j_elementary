package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {

    @Test
    public void whenIn2ThenResult2() {
        assertThat(Fact.calc(2)).isEqualTo(2);
    }

    @Test
    public void whenException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> Fact.calc(-1));
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }
}
