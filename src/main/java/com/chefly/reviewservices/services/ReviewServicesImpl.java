package com.chefly.reviewservices.services;

import com.chefly.reviewservices.inputModels.ReviewDTO;
import com.chefly.reviewservices.model.Ratings;
import com.chefly.reviewservices.model.ReviewCategory;
import com.chefly.reviewservices.model.Reviews;
import com.chefly.reviewservices.output.ApiResponse;
import com.chefly.reviewservices.output.RatingOutPut;
import com.chefly.reviewservices.repository.RatingsRepository;
import com.chefly.reviewservices.repository.ReviewCategRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sanju on 14-Apr-18.
 */

@Service
public class ReviewServicesImpl implements ReviewServices {

    @Autowired
    RatingsRepository ratingsRepository;
    @Autowired
    ReviewCategRepository reviewCategRepository;

    @Override
    public ApiResponse addReview(ReviewDTO inReview, Long refernceId, int reviewType) {

        ApiResponse outPut=new ApiResponse();

        ReviewCategory reviewCategory=reviewCategRepository.findById(inReview.getReviewCategoryId()).get();
        if(reviewCategory!=null){
            Ratings rs=new Ratings();
            rs.setReview_Cat_Id(reviewCategory);
            rs.setRating(inReview.getRating());

            Reviews rv=new Reviews();
            rv.setApproved(new Date());
            rv.setComments(inReview.getComments());
            rv.setReferenceId(refernceId);
            rv.setReviewerId(inReview.getReviewerId());
            rv.setReview_Type(reviewType);
            rv.setCreated(new Date());

            rs.setReviewId(rv);
            rs.setCreated(new Date());
            Ratings ratings=ratingsRepository.save(rs);
            outPut.setSuccess(true);
            outPut.setData(new RatingOutPut(ratings.getId(),ratings.getReviewId().getComments(),ratings.getRating()));
        }else{

            outPut.setErrorMsgEn("No Category Is Present");
            outPut.setSuccess(false);

        }

return outPut;
    }
}
