package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when2() {
        int number = 2;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void whenMinus1() {
        int number = -1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}
