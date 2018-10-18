package com.xx.bootdemo.entity;

/**
 * 接口返回封装类
 */
public class ResultBean<T> {

  public static final int SUCCESS = 0;

  public static final int FAIL = 1;

  public static final int NO_LOGIN = -1;// 未登录

  public static final int NO_PERMISSION = -2;// 无权限

  private int code = SUCCESS;

  private String message = "success";

  // private String url;

  private T data;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  // public String getUrl() {
  // return url;
  // }
  //
  // public void setUrl(String url) {
  // this.url = url;
  // }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public ResultBean() {
    super();
  }

  public ResultBean(T data) {
    super();
    this.data = data;
  }
}
