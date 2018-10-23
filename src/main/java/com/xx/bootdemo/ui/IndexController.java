package com.xx.bootdemo.ui;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

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

  /**
   * 国际化切换
   * 
   * @param request
   * @param lang
   * @return
   */
  @RequestMapping("/changeSessionLanauage")
  public String changeSessionLanauage(HttpServletRequest request, String lang) {
    if ("zh".equals(lang)) {
      request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,
          new Locale("zh", "CN"));
    } else if ("en".equals(lang)) {
      request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,
          new Locale("en", "US"));
    }
    return "redirect:/index";
  }

}
