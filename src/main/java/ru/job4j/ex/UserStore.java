package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User with login: " + login + " not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getLogin().length() < 3) {
            throw new UserInvalidException("Not a valid user");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Tet", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
