package com.example.springtest.controller;

import com.example.springtest.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamsController {

    public static final String PAGE = "param";

    @RequestMapping("/param")
    public ModelAndView param(@RequestParam(value = "id",defaultValue = "0") int id,
                              @RequestParam(value = "type",required = false) String type){
//        if (null != type && type.equals("苹果")){}
        if ("苹果".equals(type)){}
        System.out.println("id = " + id);
        System.out.println("type = " + type);
        ModelAndView view = new ModelAndView(PAGE);
        view.addObject("id",id);
        return view;
    }

    @RequestMapping("/path/{id}/{type}")
    public ModelAndView path(@PathVariable(required = false) int id,
                              @PathVariable(required = false) String type){
        if ("苹果".equals(type)){}
        System.out.println("id = " + id);
        System.out.println("type = " + type);
        ModelAndView view = new ModelAndView(PAGE);
        view.addObject("id",id);
        return view;
    }

    @GetMapping("param/user")
    @ResponseBody
    public User getUser(){
        User user = new User(1000,"李四","男",25);
        System.out.println(user);
        return user;
    }
}
