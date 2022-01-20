package com.yjhdemo.spring.testdemo;

import com.yjhdemo.spring.testdemo.Aopxml.Book;
import com.yjhdemo.spring.testdemo.config.SpringConfig;
import com.yjhdemo.spring.testdemo.service.UserService;
import jdk.jfr.StackTrace;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo1 {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testAopXml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beantow.xml");
        Book book = context.getBean("book",Book.class);
        book.buy();
    }
}
