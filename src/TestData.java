import java.util.ArrayList;

public class TestData {
    public static String[] getLogins() {
/*
Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
Например, java_skypro_go. У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов.
Если login длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить исключение –
WrongLoginException.
 */
        String[] logins = {
                "user_123",
                "cool_guy99",
                "happy_cat_42",
                "star_wars_fan",
                "tech_guru_2024",
                "explorer_77",
                "book_lover_88",
                "travel_buddy_1",
                "music_lover_9",
                "game_master_101game_master_101",
                "user@123",
                "cool guy99",
                "happy-cat-42",
                "star/wars/fan",
                "tech*guru*2024",
                "explorer#77",
                "book lover 88",
                "travel buddy!1",
                "music@lover_9",
                "game master 101"
        };


        return logins;
    }
    public static String[] getPasswords(){
        String[] passwords = {
                "valid_login_1",
                "user123",
                "test_user_2024",
                "example_login",
                "my_account_99",
                "data_entry_7",
                "code_master_88",
                "sample_user_5sample_user_5",
                "login_test_123",
                "user_name_2024",
                "invalid@login",
                "user name",
                "test-user",
                "example/login",
                "my-account-99",
                "data&entry",
                "code master",
                "sample user 5",
                "login test 123",
                "user.name.2024"
        };
        return passwords;
    }
}
