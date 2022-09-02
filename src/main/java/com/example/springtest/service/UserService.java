package com.example.springtest.service;

import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {

    public User get();

    public User getById(@PathVariable("id") int id);
}
