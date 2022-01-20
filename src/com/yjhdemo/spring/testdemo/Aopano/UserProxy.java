package com.yjhdemo.spring.testdemo.Aopano;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect//生成代理对象
@Order(3)
public class UserProxy {
//    相同切入点抽取
    @Pointcut(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void point(){

    }
//    前置通知
//    before注解表示作为前置通知
    @Before(value = "point()")
    public void before() {
        System.out.println("执行before方法");
    }
//    后置通知（返回通知）
    @AfterReturning(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void afterReturning(){
        System.out.println("执行afterReturning方法");
    }
//    异常通知
    @AfterThrowing(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void afterThrowing(){
        System.out.println("执行afterThrowing方法");
    }
    @Around(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("执行Around方法");
        System.out.println("环绕之后");
    }
//    最终通知
    @After(value = "execution(* com.yjhdemo.spring.testdemo.Aopano.User.add(..))")
    public void after(){
        System.out.println("执行after方法");
    }
}
