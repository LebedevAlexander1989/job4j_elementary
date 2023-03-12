package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        if ("Hi, Bot.".equals(question)) {
            return  "Hi, SmartAss.";
        }
        if ("Bye.".equals(question)) {
            return "See you later.";
        }
        return "I don't know. Please, ask another question.";
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}
