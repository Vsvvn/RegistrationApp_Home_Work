package app.registration.DomainService;

import app.registration.dto.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class ContainerService {

    List<Users> users = new ArrayList<>();

    public List<Users> getAll() {
        return users;
    }

    public List<Users> addUser() {
        return users;
    }

}
