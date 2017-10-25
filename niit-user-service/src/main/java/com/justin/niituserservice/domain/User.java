package com.justin.niituserservice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable{
    private Long id;
    private String name;
    private String pwd;
    private Character sex;
    private String mobile;
    private String email;
    private String avatar;
    private Integer status;
    private Date createTime;
    private Date updateTime;
//    For JUnit Test
//    public User(){}
//
//    public User(String name,String pwd){
//        this.name=name;
//        this.pwd=pwd;
//    }
//
//    public User(String name, String pwd, Character sex, String mobile, String email, String avatar, Integer status) {
//        this.name = name;
//        this.pwd = pwd;
//        this.sex = sex;
//        this.mobile = mobile;
//        this.email = email;
//        this.avatar = avatar;
//        this.status = status;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
}

