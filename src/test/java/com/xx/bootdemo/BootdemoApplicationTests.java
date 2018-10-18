package com.xx.bootdemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xx.bootdemo.entity.TestProperties;
import com.xx.bootdemo.ui.UserController;

/**
 * 单元测试
 * 
 * @author minxi
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootdemoApplicationTests {

  @Autowired
  TestProperties testProperties;

  @Autowired
  UserController userTestController;

  @Before
  public void before() {
    System.out.println("开始测试~~~~~~~~~~~");
  }

  @After
  public void after() {
    System.out.println("测试结束~~~~~~~~~~~");
  }

  @Test
  public void test() {
    System.out.println(testProperties.getStr());
    Assert.assertSame("first test", testProperties.getStr());
    // Assert.assertEquals("first test",testProperties.getStr());
  }

  @Test
  public void list() {
    System.out.println(userTestController.list().size());
    Assert.assertEquals(0, userTestController.list().size());
  }

}
