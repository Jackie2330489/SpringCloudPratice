package com.justin.niituserservice.controller;

import com.justin.niituserservice.domain.User;
import com.justin.niituserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/visitorList")
    public List<User> visitorList(){
        return userService.findListAsVisitor();
    }

    @PostMapping("/userList")
    public List<User> userList(){
        return userService.findListAsUser();
    }

    @PostMapping("/find/{id}")
    public User find(@PathVariable("id")Long id){
        return userService.findUser(id);
    }

    @PostMapping("/add")
    public String add(User user){
        return userService.addUser(user);
    }

    @PostMapping("/del/{id}")
    public String del(@PathVariable("id")Long id){
        return userService.deleteUser(id);
    }

    @PostMapping("/update")
    public String update(User user){
        return userService.updateUser(user);
    }

}
