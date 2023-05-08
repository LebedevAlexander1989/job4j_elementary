package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean value = data[0];
        for (int i = 1; i < data.length; i++) {
           if (value != data[i]) {
               result = false;
               break;
           }
        }
        return result;
    }
}
