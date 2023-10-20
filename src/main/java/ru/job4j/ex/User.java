package ru.job4j.ex;

public class User {

    private final String login;
    private final boolean valid;

    public User(String login, boolean valid) {
        this.login = login;
        this.valid = valid;
    }

    public String getLogin() {
        return login;
    }

    public boolean isValid() {
        return valid;
    }
}
