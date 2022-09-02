package com.example.springtest.bean;

import com.example.springtest.service.BService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(1)
public class BTestBean {

    @Bean
    public BService bService(){
//        System.out.println("BService加载了");
        return new BService();
    }
}
