package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    /**
     * @param password Пароль
     * @return Вернет пароль или выбросит исключение.
     */
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        if (!checkOneUppercaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }

        if (!checkOneLowercaseLetter(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }

        if (!checkOneFigure(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }

        if (!checkOneSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        if (checkContainSubstring(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean checkOneUppercaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkOneLowercaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkOneFigure(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkOneSpecialSymbol(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkContainSubstring(String password) {
        for (String str: FORBIDDEN) {
            if (password.toLowerCase().contains(str.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
