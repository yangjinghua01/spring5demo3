package com.yjhdemo.spring.testdemo.Aopano;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class User {
    public void add(){
        System.out.println("执行add方法");
    }
}
