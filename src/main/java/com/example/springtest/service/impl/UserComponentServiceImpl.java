package com.example.springtest.service.impl;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserComponentService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class UserComponentServiceImpl implements UserComponentService {

    public User get(){
        User user = new User(1,"李四","男",25);
        System.out.println("userComponentServiceImpl user = " + user);
        return user;
    }

    public User getById(@PathVariable("id") int id){
        User user = new User(id,"王五","女",18);
        System.out.println("userComponentServiceImpl getById user = " + user);
        return user;
    }
}
