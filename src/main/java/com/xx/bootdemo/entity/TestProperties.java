package com.xx.bootdemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置文件实体类
 */
@Component
public class TestProperties {

    @Value("${com.test.number}")
    private String number;

    @Value("${com.test.name}")
    private String name;

    @Value("${com.test.str}")
    private String str;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
