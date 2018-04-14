package com.chefly.reviewservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * Created by Sanju on 11-Apr-18.
 */
@Entity
@Table(name = "REVIEW_CATEGORY")
public class ReviewCategory {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "REVIEW_CAT_ID")
    Long id;

    @Column(name="CATEGORY_NAME",nullable = false)
    @NotNull
    String name;

    @Column(name="DATE_CREATED",nullable = false)
    @NotNull
    Date created_date;

    @OneToMany(fetch = FetchType.EAGER,mappedBy="review_Cat_Id")
   Set<Ratings> rating_cat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Set<Ratings> getRating_cat() {
        return rating_cat;
    }

    public void setRating_cat(Set<Ratings> rating_cat) {
        this.rating_cat = rating_cat;
    }

    @Override
    public String toString() {
        return "ReviewCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created_date=" + created_date +
                ", rating_cat=" + rating_cat +
                '}';
    }
}
