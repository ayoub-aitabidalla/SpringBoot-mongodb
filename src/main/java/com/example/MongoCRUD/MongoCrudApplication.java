package com.example.MongoCRUD;

import com.example.MongoCRUD.models.Address;
import com.example.MongoCRUD.models.Gender;
import com.example.MongoCRUD.models.User;
import com.example.MongoCRUD.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoCrudApplication.class, args);
	}



	


}
