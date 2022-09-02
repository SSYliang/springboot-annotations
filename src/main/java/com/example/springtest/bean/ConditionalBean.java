package com.example.springtest.bean;

import com.example.springtest.entity.PersonConditional;
import com.example.springtest.util.LinuxCondition;
import com.example.springtest.util.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalBean {

    @Conditional({WindowsCondition.class})
    @Bean(name = "bill")
    public PersonConditional conditionalTest1(){
        return new PersonConditional("Bill Gates",67);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public PersonConditional conditionalTest2(){
        return new PersonConditional("linux",53);
    }
}
