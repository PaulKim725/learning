package com.paul.springboot7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBoot7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot7Application.class, args);
	}

}
