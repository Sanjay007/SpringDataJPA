package com.chefly.reviewservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Sanju on 11-Apr-18.
 */
@Entity
@Table(name = "REVIEW_CATEGORY")
public class ReviewCategory {

    @Id
    @Column(name = "REVIEW_CAT_ID")
    Long id;

    @Column(name="CATEGORY_NAME")
    @NotNull
    String name;

    @Column(name="DATE_CREATED")
    @NotNull
    Date created_date;

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
}
