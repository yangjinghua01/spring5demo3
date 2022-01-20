package com.yjhdemo.spring.testdemo.Aopano;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersionProxy {
    @Before(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void afterreturning(){
        System.out.println("增强的优先级");
    }
}
