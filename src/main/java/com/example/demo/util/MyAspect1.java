package com.example.demo.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class MyAspect1 {

    @Pointcut("execution(* com.example.demo.util.UserServiceImpl.printUser(..))")
    public void pointCut(){}

    @Before("pointCut() && args(user)")
    public void before(JoinPoint point, User user){
        Object[] args = point.getArgs();
        System.out.println("before1...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after1...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning1...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing1...");
    }

    @DeclareParents(value = "com.example.demo.util.UserServiceImpl",defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;
}
