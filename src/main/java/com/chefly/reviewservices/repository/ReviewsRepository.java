package com.chefly.reviewservices.repository;

import com.chefly.reviewservices.model.ReviewCategory;
import com.chefly.reviewservices.model.Reviews;
import org.hibernate.cfg.annotations.reflection.JPAOverriddenAnnotationReader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sanju on 12-Apr-18.
 */
public interface ReviewsRepository extends JpaRepository<Reviews,Long> {
}
