package com.xx.bootdemo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * springboot启动类
 */
@SpringBootApplication
public class BootdemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootdemoApplication.class, args);
  }

  @Bean
  public LocaleResolver localeResolver() {
    SessionLocaleResolver slr = new SessionLocaleResolver();
    // 设置默认区域
    slr.setDefaultLocale(Locale.US);
    return slr;
  }
}
