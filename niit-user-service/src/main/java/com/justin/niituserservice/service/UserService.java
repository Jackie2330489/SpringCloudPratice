package com.justin.niituserservice.service;

import com.justin.niituserservice.domain.User;

import java.util.List;

public interface UserService {

    String addUser(User user);

    String deleteUser(Long id);

    String updateUser(User user);

    User findUser(Long id);

    List<User> findListAsVisitor();

    List<User> findListAsUser();

}
