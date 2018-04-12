package com.chefly.reviewservices.repository;

import com.chefly.reviewservices.model.ReviewCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sanju on 12-Apr-18.
 */
public interface ReviewCategRepository extends JpaRepository<ReviewCategory,Long> {

}
