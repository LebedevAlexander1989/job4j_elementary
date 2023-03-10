package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    void whenP8K2Square3() {
        int expected = 3;
        int p = 8;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 1);
    }

    @Test
    void whenP6K3Square1() {
        int expected = 1;
        int p = 6;
        double k = 3;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.6875);
    }
}