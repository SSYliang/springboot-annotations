package com.example.springtest.controller;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Qualifier("userImpl")
    @Autowired
    private UserService userService;

    /**
     * 查询数据，没有参数
     * @return
     */
    @GetMapping // http://localhost:8003/user
    public User get(){
        return userService.get();
    }

    /**
     * 查询数据，有id参数
     * @param id
     * @return
     */
    @GetMapping("{id}") // http://localhost:8003/user
    public User getById(@PathVariable("id") int id){
        return userService.getById(id);
    }

    /**
     * 新增数据
     * @return
     */
    @PostMapping
    public User addUser(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
