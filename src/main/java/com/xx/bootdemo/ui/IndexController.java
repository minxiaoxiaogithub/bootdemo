package com.xx.bootdemo.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  /**
   * 首页
   * 
   * @return
   */
  @RequestMapping("/index")
  public String index() {
    return "/index";
  }
}
