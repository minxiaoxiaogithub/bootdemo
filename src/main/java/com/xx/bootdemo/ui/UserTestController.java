package com.xx.bootdemo.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.bootdemo.entity.User;
import com.xx.bootdemo.services.UserService;

@RestController
@RequestMapping("/testuser")
public class UserTestController {

  @Autowired
  private UserService userService;

  @PostMapping("/add")
  public void add(User user) {
    this.userService.add(user);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id) {
    this.userService.delete(id);
  }

  @PutMapping("/update")
  public void update(User user) {
    this.userService.update(user);
  }

  @GetMapping("/list")
  public List<User> list() {
    return this.userService.list();
  }

  @GetMapping("/getById/{id}")
  public User getById(@PathVariable("id") Integer id) {
    return this.userService.getById(id);
  }
}
