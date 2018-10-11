package com.xx.bootdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xx.bootdemo.entity.User;

@Mapper
public interface UserDao {

  public void add(User user);

  public void delete(Integer id);

  public void update(User user);

  public List<User> list();

  public User getById(Integer id);
}
