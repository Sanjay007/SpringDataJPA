package com.chefly.reviewservices.inputModels;

import javax.persistence.Column;

/**
 * Created by Sanju on 13-Apr-18.
 */
public class ReviewDTO {

    int rating;
    String comments;
    Long reviewCategoryId;
    Long reviewerId;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getReviewCategoryId() {
        return reviewCategoryId;
    }

    public void setReviewCategoryId(Long reviewCategoryId) {
        this.reviewCategoryId = reviewCategoryId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }
}
