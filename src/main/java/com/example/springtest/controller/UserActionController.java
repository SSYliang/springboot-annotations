package com.example.springtest.controller;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("action")
public class UserActionController {

    @Resource(name = "adminImpl")
    private UserService userService;

    @Resource(name = "userImpl")
    private UserService userService1;

    /**
     * 查询数据，没有参数
     * @return
     */
    @GetMapping
    public User get(){
        return userService1.get();
    }

    /**
     * 查询数据，有id参数
     * @param id
     * @return
     */
    @GetMapping("{id}") // http://localhost:8003/rest/get
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
