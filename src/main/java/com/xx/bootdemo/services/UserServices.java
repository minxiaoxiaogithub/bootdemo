package com.xx.bootdemo.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.xx.bootdemo.entity.User;

@Transactional
public interface UserServices {

  public void add(User user);

  public void delete(Integer id);

  public void update(User user);

  public List<User> list();

  public User getById(Integer id);
}
