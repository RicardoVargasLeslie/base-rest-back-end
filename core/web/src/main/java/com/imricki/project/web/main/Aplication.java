package com.imricki.project.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.*")
@EntityScan("com.*")
@SpringBootApplication(scanBasePackages = "com.*")
public class Aplication {

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}
}
