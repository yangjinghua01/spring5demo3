package com.yjhdemo.spring.testdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.yjhdemo.spring.testdemo"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
