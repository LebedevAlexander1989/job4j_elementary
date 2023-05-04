package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        boolean left = false;
        boolean right = false;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell) {
                    left = true;
                } else if (row + cell == size - 1) {
                    right = true;
                }

                if (left) {
                    System.out.print("0");
                    left = false;

                } else if (right) {
                    System.out.print("0");
                    right = false;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }
}
