package com.xx.bootdemo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.bootdemo.entity.TestProperties;

/**
 * 获取配置文件的值
 */
@RestController
public class FirstController {

  @Autowired
  private TestProperties testProperties;

  @Autowired
  private Environment env;

  /**
   * 使用@value注解获取application.properties中的值
   * 
   * @return
   */
  @GetMapping("/firstController")
  public String firstController() {
    return testProperties.getStr();
  }

  /**
   * 使用Environment获取application.properties中的值
   * 
   * @return
   */
  @GetMapping("/environment")
  public String environment() {
    return env.getProperty("test");
  }


}
