package com.example.MongoCRUD.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;
}
