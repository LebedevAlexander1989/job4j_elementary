package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, three, four));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(4, 5, 6));
        System.out.println(max(10, 4, 8, 11));
    }
}

