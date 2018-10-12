package com.xx.bootdemo.ui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.bootdemo.exception.BusinessException;

/**
 * 全局异常测试UI
 */
@RestController
@RequestMapping("/exception")
public class ExceptionTestController {

  @RequestMapping("/json")
  public String json() throws BusinessException {
    throw new BusinessException("测试抛出自定义异常！");
  }

  @RequestMapping("/testnull")
  public String testnull() {
    throw new NullPointerException("测试抛出空指针异常！");
  }
}
