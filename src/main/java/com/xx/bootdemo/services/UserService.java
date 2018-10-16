package com.xx.bootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xx.bootdemo.dao.UserDao;
import com.xx.bootdemo.entity.User;

@Transactional
@Service
public class UserService {

  @Autowired
  UserDao userDao;

  public void add(User user) {
    this.userDao.add(user);
  }

  public void delete(Integer id) {
    this.userDao.delete(id);
  }

  public void update(User user) {
    this.userDao.update(user);
  }

  public List<User> list() {
    return this.userDao.list();
  }

  public User getById(Integer id) {
    return this.userDao.getById(id);
  }
}
