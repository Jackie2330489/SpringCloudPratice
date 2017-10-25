package com.justin.niituserservice.service.impl;

import com.justin.niituserservice.dao.UserDao;
import com.justin.niituserservice.domain.User;
import com.justin.niituserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String addUser(User user) {
        return userDao.insert(user)>0?"add success":"add failed";
    }

    @Override
    public String deleteUser(Long id) {
        return userDao.deleteByPrimaryKey(id)>0?"delete success":"delete failed";
    }

    @Override
    public String updateUser(User user) {
        return userDao.updateByPrimaryKey(user)>0?"update success":"update failed";
    }

    @Override
    public User findUser(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findListAsVisitor() {
        return userDao.selectListAsVisitor();
    }

    @Override
    public List<User> findListAsUser() {
        return userDao.selectListAsUser();
    }
}
