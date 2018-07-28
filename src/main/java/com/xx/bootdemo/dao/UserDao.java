package com.xx.bootdemo.dao;

import com.xx.bootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public void add(User user);

    public void delete(Integer id);

    public void update(User user);

    public List<User> list();

    public User getById(Integer id);
}
