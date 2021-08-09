package com.aop.springbootaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.aop.springbootaop.service.*.getUsers(..))")
    public void BeforeGetUsers(JoinPoint joinPoint){

        System.out.println(joinPoint.getSignature());





    }
    @After("execution(* com.aop.springbootaop.service.*.saveUser(..))")
    public void AfterSaveUser(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.aop.springbootaop.service.*.updateUser(..))")
    public void AfterUpdateUser(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.aop.springbootaop.service.*.deleteUser(..))")
    public void AfterDeleteUser(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }
}
