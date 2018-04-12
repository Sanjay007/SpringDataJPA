package com.chefly.reviewservices;

import com.chefly.reviewservices.model.ReviewCategory;
import com.chefly.reviewservices.repository.ReviewCategRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages="chefly.reviewservices")
@EntityScan(basePackages="com.chefly.reviewservices.model")
@EnableJpaRepositories
public class ReviewServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewServicesApplication.class, args);
	}

	@Autowired
	ReviewCategRepository reviewCategRepository;

	@Bean
	CommandLineRunner runner() {
		return args -> {

			List<ReviewCategory> ss=reviewCategRepository.findAll();
			System.out.print("*******************"+ss.get(0).toString());
		};
	}
}
