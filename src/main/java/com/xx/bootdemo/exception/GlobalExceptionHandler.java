package com.xx.bootdemo.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xx.bootdemo.entity.ResultBean;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  /**
   * BusinessException处理方法
   *
   * @param request
   * @param e
   * @return
   */
  @ExceptionHandler(value = BusinessException.class)
  @ResponseBody
  public ResultBean<Object> businessExceptionHandler(HttpServletRequest request, Exception e) {
    ResultBean<Object> resultBean = new ResultBean<Object>();
    resultBean.setCode(ResultBean.FAIL);
    resultBean.setMessage(e.getMessage());
    // resultBean.setUrl(request.getRequestURI().toString());
    // 根据实际情况判断是否需要返回data
    resultBean.setData("Some Data");
    return resultBean;
  }

  /**
   * Exception处理方法
   * 
   * (ExceptionHandler只匹配具体类型， 如BusinessException，父类为Exception,只会触发如BusinessException处理类！)
   *
   * @param request
   * @param e
   * @return
   */
  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public ResultBean<Object> exceptionHandler(HttpServletRequest request, Exception e) {
    ResultBean<Object> resultBean = new ResultBean<Object>();
    resultBean.setCode(ResultBean.FAIL);
    resultBean.setMessage(e.getMessage());
    // resultBean.setUrl(request.getRequestURI().toString());
    // 根据实际情况判断是否需要返回data
    resultBean.setData("Some Data");
    logger.error("error", e);
    return resultBean;
  }
}
