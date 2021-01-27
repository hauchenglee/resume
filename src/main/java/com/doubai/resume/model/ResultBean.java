package com.doubai.resume.model;

import lombok.Data;

import java.util.Optional;

@Data
public class ResultBean<T> {
    private int code = 0;
    private String message = "SUCCESS";
    private T data;

    private ResultBean() {
    }

    public static <T> ResultBean<T> success(Boolean result) {
        ResultBean<T> ResultBean = new ResultBean<>();
        ResultBean.code = ResultCode.SUCCESS.getCode();
        ResultBean.message = ResultCode.SUCCESS.getMessage();
        ResultBean.data = (T) result;
        return new ResultBean<>();
    }

    public static <T> ResultBean<T> success(Optional<T> data) {
        ResultBean<T> ResultBean = new ResultBean<>();
        ResultBean.code = ResultCode.SUCCESS.getCode();
        ResultBean.message = ResultCode.SUCCESS.getMessage();
        ResultBean.data = (T) data;
        return ResultBean;
    }

    public static <T> ResultBean<T> error(int code, String message) {
        ResultBean<T> ResultBean = new ResultBean<>();
        ResultBean.code = code;
        ResultBean.message = message;
        return ResultBean;
    }
}
