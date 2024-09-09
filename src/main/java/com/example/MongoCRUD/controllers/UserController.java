package com.example.MongoCRUD.controllers;

import com.example.MongoCRUD.models.User;
import com.example.MongoCRUD.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/add")
    private void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getAllUsers(@PathVariable String id) {

        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(id, user), HttpStatus.OK);

    }

}
