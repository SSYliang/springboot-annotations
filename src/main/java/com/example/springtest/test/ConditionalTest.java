package com.example.springtest.test;

import com.example.springtest.bean.ConditionalBean;
import com.example.springtest.entity.PersonConditional;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionalTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalBean.class);

    @Test
    public void test1() {
        String osName = applicationContext.getEnvironment().getProperty("os.name");
        System.out.println("当前系统为：" + osName);
        Map<String, PersonConditional> map = applicationContext.getBeansOfType(PersonConditional.class);
        System.out.println(map);
    }
}
