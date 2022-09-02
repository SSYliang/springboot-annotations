package com.example.springtest.controller;

import com.example.springtest.entity.User;
import com.example.springtest.service.UserComponentService;
import com.example.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("action/comp")
public class UserActionComponentController {

    @Autowired
    private UserComponentService userComponentService;

    /**
     * 查询数据，没有参数
     * @return
     */
    @GetMapping
    public User get(){
        return userComponentService.get();
    }

    /**
     * 查询数据，有id参数
     * @param id
     * @return
     */
    @GetMapping("{id}") // http://localhost:8003/action/comp
    public User getById(@PathVariable("id") int id){
        return userComponentService.getById(id);
    }
}
