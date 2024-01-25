package app.registration.service;
import app.registration.dto.Users;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserService userService;

    public UserService(UserService userService) {
        this.userService = userService;
    }


    public List<Users> getAll() {
        return userService.getAll();
    }

    public Optional<Users> addUser(Users users) {
        return userService.addUser(users);
    }

}
