package com.xx.bootdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xx.bootdemo.entity.User;

@Mapper
public interface UserDao {

  public Integer add(User user);

  public void delete(@Param("id") Integer id);

  public void update(User user);

  public List<User> list();

  public User getById(@Param("id") Integer id);

//  public List<User> pageList();
//
//  public Integer getCount();
}
