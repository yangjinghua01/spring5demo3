package com.yjhdemo.spring.testdemo.service;

import com.yjhdemo.spring.testdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;

//在注解里面value属性值可以省略不写，
//默认是类名称，首字母小写
//@Component(value = "userService") //类似<bean id ="username" class= "..."/>
@Service
public class UserService {
    //    定义到类型属性
//    不需要添加set方法
//    添加注入属性注解
    @Value(value = "123")
    private String name;
    @Autowired
    @Qualifier(value = "impl1")
//    @Resource (name = "impl1")

    private UserDao userDao;

    public void add() {
        System.out.println("service add ................." + name);
        userDao.add();
    }
}
