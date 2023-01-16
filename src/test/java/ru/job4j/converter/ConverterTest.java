package ru.job4j.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert0RublesThen0Dlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.1f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert200RblThen3dot3333333Dlr() {
        float in = 200;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.3333333f;
        Assertions.assertEquals(expected, out, eps);
    }
}