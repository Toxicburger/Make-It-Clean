package com.project.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.project")
@ComponentScan(basePackages = "com.project")
@EnableJpaRepositories(basePackages = "com.project.Repository")	
@EntityScan(basePackages = "com.project.UserEntity")
@EnableJpaAuditing
public class MicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicApplication.class, args);
	}

}
