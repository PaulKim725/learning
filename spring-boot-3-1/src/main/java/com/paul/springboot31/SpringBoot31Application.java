package com.paul.springboot31;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.paul.springboot31.mapper")
@SpringBootApplication
public class SpringBoot31Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot31Application.class, args);
	}

}
