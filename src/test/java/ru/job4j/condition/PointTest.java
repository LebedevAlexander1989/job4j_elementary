package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    void when00to10then1dot1() {
        double expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.1);
    }

    @Test
    void when00to01then1() {
        double expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.1);
    }

    @Test
    void when10to00then1() {
        double expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.1);
    }

}