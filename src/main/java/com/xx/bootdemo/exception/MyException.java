package com.xx.bootdemo.exception;

/**
 * 自定义异常类
 */
public class MyException extends Exception {

  private static final long serialVersionUID = 1L;

  public MyException(String message) {
    super(message);
  }
}
