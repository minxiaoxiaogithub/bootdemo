package com.xx.bootdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xx.bootdemo.dao.UserDao;
import com.xx.bootdemo.entity.User;
import com.xx.bootdemo.services.UserServices;

@Service
public class UserSevicesImpl implements UserServices {

  @Autowired
  UserDao userDao;

  @Override
  public void add(User user) {
    this.userDao.add(user);
  }

  @Override
  public void delete(Integer id) {
    this.userDao.delete(id);
  }

  @Override
  public void update(User user) {
    this.userDao.update(user);
  }

  @Override
  public List<User> list() {
    return this.userDao.list();
  }

  @Override
  public User getById(Integer id) {
    return this.userDao.getById(id);
  }
}
