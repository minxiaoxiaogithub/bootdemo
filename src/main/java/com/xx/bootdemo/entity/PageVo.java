package com.xx.bootdemo.entity;

import java.io.Serializable;
import java.util.List;

public class PageVo<T> implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private Long count;
  private Integer pageSize;
  private Integer page;
  private List<T> data;

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

}
