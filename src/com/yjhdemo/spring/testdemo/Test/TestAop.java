package com.yjhdemo.spring.testdemo.Test;

import com.yjhdemo.spring.testdemo.Aopano.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//测试的时候要执行被增强类的方法
public class TestAop {
    @Test
    public  void Testaop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanOne.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
