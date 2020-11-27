package com.paul.springboot6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBoot6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot6Application.class, args);
	}

}
