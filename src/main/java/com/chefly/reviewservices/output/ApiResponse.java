package com.chefly.reviewservices.output;

/**
 * Created by Sanju on 14-Apr-18.
 */
public class ApiResponse {

   private String errorMsgEn;
    private boolean success = true;
    private Object data;
    public ApiResponse(){

    }

    public ApiResponse(String errorMsgEn, boolean success, Object data) {

        this.errorMsgEn = errorMsgEn;
        this.success = success;
        this.data = data;
    }

    public ApiResponse(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    public String getErrorMsgEn() {
        return errorMsgEn;
    }

    public void setErrorMsgEn(String errorMsgEn) {
        this.errorMsgEn = errorMsgEn;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
