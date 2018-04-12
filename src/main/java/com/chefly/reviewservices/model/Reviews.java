package com.chefly.reviewservices.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sanju on 12-Apr-18.
 */
@Entity
@Table(name = "REVIEWS")
public class Reviews {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "REVIEW_ID",nullable = false)
    Long Id;

    @Column(name = "REVIEW_TYPE",nullable = false)
    int review_Type;

    @Column(name ="REVIEWER_ID",nullable = false)
    Long reviewerId;

    @Column(name ="REFERENE_ID",nullable = false)
    Long referenceId;

    @Column(name ="REVIEW_COMMENTS")
    String comments;

    @Column(name ="DATE_CREATED")
    Date created;

    @Column(name ="DATE_APPROVED")
    Date approved;

    @Column(name ="DATE_UPDATED")
    Date updated;

    @OneToOne(mappedBy="reviewId")
    private Ratings ratings;

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getApproved() {
        return approved;
    }

    public void setApproved(Date approved) {
        this.approved = approved;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public int getReview_Type() {
        return review_Type;
    }

    public void setReview_Type(int review_Type) {
        this.review_Type = review_Type;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }
}
