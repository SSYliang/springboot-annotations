package com.example.springtest.bean;

import com.example.springtest.service.UserService;
import com.example.springtest.service.impl.AdminServiceImpl;
import com.example.springtest.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeans {

//    @Bean(name = "admin")
    @Bean
    public UserService adminImpl(){
        return new AdminServiceImpl();
    }

    @Bean
    public UserService userImpl(){
        return new UserServiceImpl();
    }
}
