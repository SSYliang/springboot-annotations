package com.example.springtest.service.impl;

import com.example.springtest.service.HelloService;
import com.example.springtest.util.MyConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(MyConfigurationProperties.class)
public class HelloServiceImpl implements HelloService {
}
