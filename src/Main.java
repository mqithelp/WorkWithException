import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int randomNumberOne = rn.nextInt(0, 20);
        int randomNumberTwo = rn.nextInt(0, 20);

        try {
            Authorization.checkForm(
                    TestData.getLogins()[randomNumberOne],
                    TestData.getPasswords()[randomNumberTwo],
                    TestData.getPasswords()[randomNumberTwo]);
        } catch (WrongPasswordException e) {
            System.out.println("Пароль неверный.");
            throw new WrongPasswordException();
        } catch (WrongLoginException e) {
            System.out.println("Логин неверный.");
            throw new WrongLoginException();
        } finally {
            System.out.println("Логин: " + TestData.getLogins()[randomNumberOne]);
            System.out.println("Пароль: " + TestData.getPasswords()[randomNumberTwo]);
        }
    }
}