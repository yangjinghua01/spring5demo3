package com.yjhdemo.spring.testdemo;

import com.yjhdemo.spring.testdemo.service.UserService;
import jdk.jfr.StackTrace;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo1 {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
