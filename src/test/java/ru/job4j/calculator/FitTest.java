package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FitTest {

    @Test
    void  whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManHeight187ThenWeight100dot05() {
        short height = 187;
        double expected = 100.05;
        double out = Fit.manWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenManHeight160ThenWeight69dot00() {
        short height = 160;
        double expected = 69.00;
        double out = Fit.manWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight177ThenWeight77dot05() {
        short height = 177;
        double expected = 77.05;
        double out = Fit.womanWeight(height);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight150ThenWeight46dot00() {
        short height = 150;
        double expected = 46.00;
        double out = Fit.womanWeight(height);
        assertEquals(expected, out, 0.01);
    }
}
