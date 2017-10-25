package com.justin.niituserservice.dao;

import com.justin.niituserservice.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int insert(User user);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(User user);

    User selectByPrimaryKey(Long id);

    List<User> selectListAsVisitor();

    List<User> selectListAsUser();

}
