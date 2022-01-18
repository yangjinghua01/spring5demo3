package com.yjhdemo.spring.testdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
//       创建接口实现类代理对象
//        第一种方式实现通过匿名内部类
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
//        创建代理对象代码
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result =dao.add(1,2);
        System.out.println(result);
    }

    static class UserDaoProxy implements InvocationHandler {
        //            把创建是谁的代理对象，把谁传递过来
//在这个方法里写增强的部分代码
        private Object obj;
        public UserDaoProxy(Object obj) {
            this.obj =obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            方法之前
            System.out.println("方法执行之前=======================================>"+method.getName()+"======<参数列表"+ Arrays.toString(args));
//            被增强的方法执行
            Object invokes = method.invoke(obj, args);
//            方法之后
            System.out.println("方法执行之后=======================================>"+obj);
            return invokes;
        }
    }
}
