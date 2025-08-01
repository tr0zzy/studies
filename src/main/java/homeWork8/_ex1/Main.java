package homeWork8._ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Dmitrii", 16, "dumitru001@gmail.com"),
                new User("Sofia", 23, "sofia112233@gmail.com"),
                new User("Artur", 45, "artur122334@gmail.com"),
                new User("Nina", 19, "nina455667@gmail.com")
                );

        List<User> adults = UserUtils.filterUsers(users, user -> user.getAge() >= 18 );
        System.out.println("Совершенолетние пользователи: ");
        UserUtils.processUsers(adults, user -> System.out.println(user));

        System.out.println("-----------------------------------------");
        List<User> over30 = UserUtils.filterUsers(users, user -> user.getAge() > 30);
        System.out.println("Отправка писем: ");
        UserUtils.processUsers(over30, user ->
                System.out.println("Письмо отправлено пользователю: " + user.getName())
        );
    }
}
