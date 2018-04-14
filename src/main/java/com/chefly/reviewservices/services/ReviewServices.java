package com.chefly.reviewservices.services;

import com.chefly.reviewservices.inputModels.ReviewDTO;
import com.chefly.reviewservices.output.ApiResponse;

/**
 * Created by Sanju on 14-Apr-18.
 */
public interface ReviewServices {

    ApiResponse addReview(ReviewDTO inReview, Long refernceId, int reviewType);
}
