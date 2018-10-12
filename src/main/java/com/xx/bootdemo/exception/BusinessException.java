package com.xx.bootdemo.exception;

/**
 * 自定义业务异常类
 */
public class BusinessException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public BusinessException() {
    super();
  }

  public BusinessException(String message) {
    super(message);
  }

  public BusinessException(String message, Throwable cause) {
    super(message, cause);
  }

  public BusinessException(Throwable cause) {
    super(cause);
  }
}
