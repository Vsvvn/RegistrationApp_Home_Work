package app.registration.service;

import app.registration.dto.Login;
import app.registration.dto.User;

public interface UserService {

    int register(User user);

    User validateUser(Login login);
}

