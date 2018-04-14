package com.chefly.reviewservices.output;

/**
 * Created by Sanju on 14-Apr-18.
 */
public class RatingOutPut {

    Long id;
    String Comments;
    int rating;

    public RatingOutPut(Long id, String comments, int rating) {
        this.id = id;
        Comments = comments;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
