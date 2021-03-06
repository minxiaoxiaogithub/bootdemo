package com.xx.bootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xx.bootdemo.dao.UserDao;
import com.xx.bootdemo.entity.PageVo;
import com.xx.bootdemo.entity.User;

@Transactional
@Service
public class UserService {

  @Autowired
  UserDao userDao;

  public Integer add(User user) {
    this.userDao.add(user);
    return user.getId();
  }

  public Integer delete(Integer id) {
    this.userDao.delete(id);
    return id;
  }

  public Integer update(User user) {
    this.userDao.update(user);
    return user.getId();
  }

  public List<User> list() {
    return this.userDao.list();
  }

  public User getById(Integer id) {
    return this.userDao.getById(id);
  }

  public PageVo<User> pageList(Integer page, Integer pageSize) {
    PageVo<User> pageVo = new PageVo<User>();
    
    PageHelper.startPage(page,pageSize);
    List<User> data = this.userDao.list();
    PageInfo<User> pageInfo = new PageInfo<User>(data);
    pageVo.setData(data);
//    Integer count=this.userDao.getCount();
    pageVo.setPage(pageInfo.getPageNum());
    pageVo.setPageSize(pageInfo.getPageSize());
    pageVo.setCount(pageInfo.getTotal());
    return pageVo;
  }
}
