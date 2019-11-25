package com.imricki.project.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com" })
@EnableJpaRepositories("com")
public class Aplication {

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}
}
