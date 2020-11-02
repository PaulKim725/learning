package com.paul.springboot2;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}

}
