package com.xx.bootdemo.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.bootdemo.entity.User;

import io.swagger.annotations.ApiOperation;

/**
 * 用户UI
 */
@RestController
@RequestMapping("/user")
public class UserController {

  // 创建线程安全的Map
  static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<Integer, User>());

  /**
   * 查询用户列表
   *
   * @return
   */
  @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
  @GetMapping
  public List<User> getUserList() {
    List<User> list = new ArrayList<User>(users.values());
    return list;
  }

  /**
   * 新增
   *
   * @param user
   * @return
   */
  @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
  @PostMapping
  public String postUser(@ModelAttribute User user) {
    users.put(user.getId(), user);
    return "success";
  }

  /**
   * 查询
   *
   * @param id
   * @return
   */
  @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) {
    return users.get(id);
  }

  /**
   * 修改
   *
   * @param id
   * @param user
   * @return
   */
  @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
  @PutMapping("/{id}")
  public String putUser(@PathVariable Integer id, @ModelAttribute User user) {
    User u = users.get(id);
    u.setName(user.getName());
    u.setAge(user.getAge());
    users.put(id, u);
    return "success";
  }

  /**
   * 删除
   *
   * @param id
   * @return
   */
  @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
  @DeleteMapping("/{id}")
  public String deleteUser(@PathVariable Long id) {
    users.remove(id);
    return "success";
  }
}
