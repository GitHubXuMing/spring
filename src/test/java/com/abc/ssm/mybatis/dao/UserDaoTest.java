package com.abc.ssm.mybatis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void findById() {
        System.out.println(userDao.findById(1));
        System.out.println(userDao.findById(11));
    }

    @Test
    public void findAll() {
        userDao.findAll().stream().forEach(System.out::println);
    }
}