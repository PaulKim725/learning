package com.paul.springboot61;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBoot61Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot61Application.class, args);
	}

}
