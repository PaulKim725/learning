package com.paul.springboot8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBoot8Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot8Application.class, args);
	}

}
