package app.registration.domainService;

import app.registration.dto.Login;
import app.registration.dto.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContainerService {

    private int COUNT_USER;
    private final List<User> users = new ArrayList<>();


    // Метод добавляет пользователя и инкриминирует id.
    public int register(@NotNull User user) {
        user.setId(++COUNT_USER);
        users.add(user);
        return user.getId();
    }

    // Метод сравнивает поля пользователя и логина, возвращает пользователя, если поля эквивалентны.
    public User validateUser(@NotNull Login login) {
        for (User user : users) {
            if (user.getUsername().equals(login.getUsername()) && (user.getPassword().equals(login.getPassword()))) {
                return user;
            }
        }
        return null;
    }
}
