package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        System.out.println(first + second);
    }

    public static void minus(int first, int second) {
        System.out.println(first - second);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int five = 5;
        int four = 4;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        plus(10, 20);
        minus(20, 10);
    }
}
