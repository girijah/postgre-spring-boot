package com.nyl.postgredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PostgreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreDemoApplication.class, args);
	}
}
