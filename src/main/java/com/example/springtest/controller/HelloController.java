package com.example.springtest.controller;

import com.example.springtest.util.MyConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private MyConfigurationProperties config;

    @GetMapping("/config")
    private String testConfigurationProperties(){
        System.out.println(config);
        return "SUCCESS!!!";
    }
}
