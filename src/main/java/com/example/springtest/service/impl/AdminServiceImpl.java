package com.example.springtest.service.impl;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AdminServiceImpl implements UserService {

    public User get(){
        User user = new User(1,"张三","男",25);
        System.out.println("adminServiceImpl user = " + user);
        return user;
    }

    public User getById(@PathVariable("id") int id){
        User user = new User(id,"getById","女",18);
        System.out.println("adminServiceImpl getById user = " + user);
        return user;
    }
}
