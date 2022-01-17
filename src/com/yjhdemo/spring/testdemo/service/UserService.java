package com.yjhdemo.spring.testdemo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//在注解里面value属性值可以省略不写，
//默认是类名称，首字母小写
@Component(value = "userService") //类似<bean id ="username" class= "..."/>
public class UserService {
    public void  add(){
        System.out.println("service add .................");
    }
}
