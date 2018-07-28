package com.xx.bootdemo.entity;

/**
 * 异常信息类
 */
public class ErrorInfo<T> {

    public static final Integer SUCCESS = 200;

    public static final Integer ERROR = 400;

    private Integer code;

    private String message;

    private String url;

    private T data;

    public static Integer getSUCCESS() {
        return SUCCESS;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
