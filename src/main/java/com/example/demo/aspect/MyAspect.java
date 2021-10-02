package com.example.demo.aspect;

import com.example.demo.util.User;
import com.example.demo.util.UserValidator;
import com.example.demo.util.UserValidatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class MyAspect {

    @Pointcut("execution(* com.example.demo.util.UserServiceImpl.printUser(..))")
    public void pointCut(){}

    @Before("pointCut() && args(user)")
    public void before(JoinPoint point, User user){
        Object[] args = point.getArgs();
        System.out.println("before...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    @DeclareParents(value = "com.example.demo.util.UserServiceImpl",defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;
}