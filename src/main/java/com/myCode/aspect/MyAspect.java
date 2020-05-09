package com.myCode.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.myCode.service.impl.UserService.*(..))")
    public void before()
    {
        System.out.println("前置通知......................");
    }
}
