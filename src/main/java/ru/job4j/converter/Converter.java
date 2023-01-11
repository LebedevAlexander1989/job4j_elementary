package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float euroOut = Converter.rubleToEuro(in);
        boolean passed = expected == euroOut;
        System.out.println("140 rubles are " + euroOut + " euro. Test result is: " + passed);

        in = 300;
        expected = 5;
        float dollarOut = Converter.rubleToDollar(in);
        passed = expected == dollarOut;
        System.out.println("300 rubles are " + dollarOut + " dollar. Test result is: " + passed);
    }
}
