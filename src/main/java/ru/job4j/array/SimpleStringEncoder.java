package ru.job4j.array;

public class SimpleStringEncoder {

    // входящие данные aaabbc
    // ответ

    /**
     * мы проверяем 0 и 1 значение если равны, тогда +1 к счетчику
     * если не равны, то добавялем в апенд и начинаем двигатться дальше
     */
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                symbol = input.charAt(i);
                counter++;
            } else {
                result = (result + symbol) + (counter == 1 ? "" : counter);
                symbol = input.charAt(i);
                counter = 1;
                if (i == input.length() - 1) {
                    result += symbol;
                }
            }
        }
        if (counter > 1) {
            result = (result + symbol) + counter;
        }
        return result;
    }
}
