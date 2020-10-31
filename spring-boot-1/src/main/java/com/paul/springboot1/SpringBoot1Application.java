package com.paul.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication中默认对springboot1包下的注解进行扫描;除springboot1下包外其他包的注解扫描需要添加@ComponentScan，无@ComponentScan注解无法访问CommonController请求；
@SpringBootApplication
@ComponentScan({"com.paul.common.web"})
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
