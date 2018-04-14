package com.chefly.reviewservices.controller;

import com.chefly.reviewservices.constants.APPConstants;
import com.chefly.reviewservices.constants.ReviewType;
import com.chefly.reviewservices.inputModels.ReviewDTO;
import com.chefly.reviewservices.output.ApiResponse;
import com.chefly.reviewservices.services.ReviewServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sanju on 11-Apr-18.
 */
@RestController
public class RatingReviewController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    ReviewServices reviewServices;

    @PostMapping(value = APPConstants.BASE_END_POINT+APPConstants.CUST_REVIEW+"/{customerId}")
    public ApiResponse addCustomerReview(@PathVariable("customerId") Long customerId,@RequestBody ReviewDTO inReview) {

       return  reviewServices.addReview(inReview, customerId, ReviewType.CUSTOMER);

    }

    @PostMapping(value = APPConstants.BASE_END_POINT+APPConstants.MERCHANT_REVIEW+"/{merchantId}")
    public ApiResponse addMerchantReview(@PathVariable("merchantId") Long merchantId,@RequestBody ReviewDTO inReview) {

        return  reviewServices.addReview(inReview, merchantId, ReviewType.MERCHANT);

    }

    @PostMapping(value = APPConstants.BASE_END_POINT+APPConstants.PROD_REVIEW+"/{menuId}")
    public ApiResponse addProductReview(@PathVariable("menuId") Long menuId,@RequestBody ReviewDTO inReview) {

        return  reviewServices.addReview(inReview, menuId, ReviewType.MENU_ITEM);

    }

    @GetMapping(value = APPConstants.GET_PRODUCT_REVIEWS)
    public ApiResponse getAllProdReviews(@PathVariable("productid") Long productid) {

        return  new ApiResponse(true,"");

    }
}
