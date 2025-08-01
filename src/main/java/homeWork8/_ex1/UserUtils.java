package homeWork8._ex1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class UserUtils {

    public static List<User> filterUsers (List<User> users, Predicate<User> condition){
        return users.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
    public static void processUsers(List<User> users, Consumer<User> action){
        users.forEach(action);

    }

}
