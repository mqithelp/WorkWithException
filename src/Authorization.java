import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Authorization {

    public static void checkForm(String login, String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9_]{1,20}$";
        if (!Pattern.matches(regex, login)) {
            throw new WrongLoginException();
        }
        if (!Pattern.matches(regex, password) || !(password.equals(confirmPassword))) {
            throw new WrongPasswordException();
        }

    }
}

