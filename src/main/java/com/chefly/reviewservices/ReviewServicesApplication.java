package com.chefly.reviewservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages="chefly.reviewservices")
@EntityScan(basePackages="com.chefly.reviewservices.model")
public class ReviewServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewServicesApplication.class, args);
	}
}
