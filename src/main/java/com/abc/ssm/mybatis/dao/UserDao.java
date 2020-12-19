package com.abc.ssm.mybatis.dao;

import com.abc.ssm.mybatis.dao.entity.User;

import java.util.List;

public interface UserDao {
    public User findById(Integer userId);
    public List<User> findAll();
}
