package app.registration.service;


import app.registration.domainService.ContainerService;
import app.registration.dto.Login;
import app.registration.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public ContainerService containerService;

    @Autowired
    public UserServiceImpl(ContainerService userDao) {
        this.containerService = userDao;
    }

    // Метод добавляет зарегистрированного пользователя.
    public int register(User user) {
        return containerService.register(user);
    }

    //Метод возвращает авторизованного пользователя
    public User validateUser(Login login) {
        return containerService.validateUser(login);
    }
}
