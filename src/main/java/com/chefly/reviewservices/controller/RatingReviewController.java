package com.chefly.reviewservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sanju on 11-Apr-18.
 */
@RestController
@RequestMapping("/")
public class RatingReviewController {

    @GetMapping
    public String  getAllNotes() {
        return "Hello World";
    }
}
