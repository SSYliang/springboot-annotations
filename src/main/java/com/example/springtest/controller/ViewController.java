package com.example.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    public static final String PAGE = "view";

    @RequestMapping("view")
    public String view(){
        return PAGE;
    }

    @RequestMapping("data")
    public ModelAndView data(){
        ModelAndView view = new ModelAndView(PAGE);
        view.addObject("str1","我叫 hello!");
        view.addObject("str2","我是张三");
        return view;
    }
}
