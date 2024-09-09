package com.example.MongoCRUD.repositories;

import com.example.MongoCRUD.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
