package com.yjhdemo.spring.testdemo.dao;

import org.springframework.stereotype.Repository;

@Repository (value = "impl1")   //---------------------一个借口具有多个实现类 配合service层的 @Qualifier使用
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("执行了dao的实现类");
    }
}
