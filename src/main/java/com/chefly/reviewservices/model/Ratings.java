package com.chefly.reviewservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Sanju on 12-Apr-18.
 */

@Entity
@Table(name = "RATINGS")
public class Ratings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "RATING_ID")
    Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REVIEW_ID")
    Reviews reviewId;

    @ManyToOne
    @JoinColumn(name = "REVIEW_CAT_ID")
    ReviewCategory review_Cat_Id;

    @Column(name ="RATING")
    int rating;

    @Column(name ="DATE_CREATED")
    Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reviews getReviewId() {
        return reviewId;
    }

    public void setReviewId(Reviews reviewId) {
        this.reviewId = reviewId;
    }

    public ReviewCategory getReview_Cat_Id() {
        return review_Cat_Id;
    }

    public void setReview_Cat_Id(ReviewCategory review_Cat_Id) {
        this.review_Cat_Id = review_Cat_Id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
