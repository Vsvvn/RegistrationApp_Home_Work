package app.registration.controller;


import app.registration.dto.Users;
import app.registration.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("*/all")
    ResponseEntity<List<Users>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping()

    public ResponseEntity<Users> addUser(@RequestBody Users users) {
        return ResponseEntity.of(userService.addUser(users));
    }



}
