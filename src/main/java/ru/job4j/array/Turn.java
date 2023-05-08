package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int lengthArrayResult = array.length % 2 == 0 ? array.length / 2 : (array.length - 1) / 2;
        for (int i = 0; i < lengthArrayResult; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
