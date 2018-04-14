package com.chefly.reviewservices;

import com.chefly.reviewservices.model.Ratings;
import com.chefly.reviewservices.model.ReviewCategory;
import com.chefly.reviewservices.model.Reviews;
import com.chefly.reviewservices.repository.RatingsRepository;
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

import java.util.Date;
import java.util.List;

@SpringBootApplication
@EntityScan(basePackages="com.chefly.reviewservices.model")
@EnableJpaRepositories
public class ReviewServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewServicesApplication.class, args);
	}

	@Autowired
	ReviewCategRepository reviewCategRepository;

	@Autowired
	RatingsRepository ratingsRepository;
	@Bean
	CommandLineRunner runner() {
		return args -> {

			ReviewCategory reviewCateg=new ReviewCategory();
			reviewCateg.setCreated_date(new Date());
			reviewCateg.setName("TEST CATEG");
			reviewCategRepository.save(reviewCateg);
			System.out.print("--Inserted Review Category Tests--");

			/*List<ReviewCategory> ss=reviewCategRepository.findAll();
			System.out.print("** Retrieving Inserted one "+ss.get(0).toString());

			Ratings rs=new Ratings();
			rs.setReview_Cat_Id(reviewCategRepository.findById(1L).get());
			rs.setRating(6);

			Reviews rv=new Reviews();
			rv.setApproved(new Date());
			rv.setComments("asasasas");
			rv.setReferenceId(1L);
			rv.setReviewerId(1L);
			rv.setReview_Type(1);
			rv.setCreated(new Date());

			rs.setReviewId(rv);
			rs.setCreated(new Date());
			ratingsRepository.save(rs);

			System.out.print("Saved Rating & Reviews ");*/

		};
	}
}
