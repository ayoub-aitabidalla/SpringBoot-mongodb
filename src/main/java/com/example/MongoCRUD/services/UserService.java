package com.example.MongoCRUD.services;

import com.example.MongoCRUD.models.User;
import com.example.MongoCRUD.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository UserRepository;
    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
    }

    public String deleteUser(String id) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
        userRepository.delete(user);
        return "user deleted";
    }

    public User updateUser(String id, User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"));
        BeanUtils.copyProperties(user,userToUpdate, "id");
        return userRepository.save(userToUpdate);
    }

}
