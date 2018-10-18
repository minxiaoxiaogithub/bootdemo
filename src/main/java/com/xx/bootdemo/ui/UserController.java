package com.xx.bootdemo.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xx.bootdemo.entity.ResultBean;
import com.xx.bootdemo.entity.User;
import com.xx.bootdemo.services.UserService;

@RestController
@RequestMapping("/testuser")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/add")
  public ResultBean<Integer> add(@RequestBody User user) {
    return new ResultBean<Integer>(this.userService.add(user));
  }

  @DeleteMapping("/delete/{id}")
  public ResultBean<Integer> delete(@PathVariable("id") Integer id) {
    return new ResultBean<Integer>(this.userService.delete(id));
  }

  @PutMapping("/update")
  public ResultBean<Integer> update(@RequestBody User user) {
    return new ResultBean<Integer>(this.userService.update(user));
  }

  @GetMapping("/getById/{id}")
  public ResultBean<User> getById(@PathVariable("id") Integer id) {
    return new ResultBean<User>(this.userService.getById(id));
  }

  @GetMapping("/list")
  public ResultBean<List<User>> list() {
    return new ResultBean<List<User>>(this.userService.list());
  }
}
