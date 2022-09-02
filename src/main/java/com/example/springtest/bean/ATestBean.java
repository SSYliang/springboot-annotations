package com.example.springtest.bean;

import com.example.springtest.service.AService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(2)
public class ATestBean {

    @Bean
    public AService aService(){
//        System.out.println("AService加载了");
        return new AService();
    }
}
