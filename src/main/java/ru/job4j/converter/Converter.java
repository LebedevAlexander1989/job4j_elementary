package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float euroOut = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == euroOut;
        System.out.println("140 rubles are " + euroOut + " euro. Test result is: " + passed1);

        float in2 = 300;
        float expected2 = 5;
        float dollarOut = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == dollarOut;
        System.out.println("300 rubles are " + dollarOut + " dollar. Test result is: " + passed2);
    }
}
