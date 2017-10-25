package com.justin.niituserservice.dao;

import com.justin.niituserservice.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() throws Exception {
//        User user=new User("LeBron","123");
//        userDao.insert(user);
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
        userDao.deleteByPrimaryKey(1001L);
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
        User user=userDao.selectByPrimaryKey(1000L);
        user.setPwd("123");
        userDao.updateByPrimaryKey(user);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        System.out.println(userDao.selectByPrimaryKey(1000L));
    }

    @Test
    public void selectListAsVisitor() throws Exception {
        System.out.println(userDao.selectListAsVisitor());
    }

    @Test
    public void selectListAsUser() throws Exception {
        System.out.println(userDao.selectListAsUser());
    }

}