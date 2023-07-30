package com.learningTech;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class LoginAspect {

    @Before("execution(* com.learningTech.ShoppingCrat.checkout(..))")
    public void before_Logger(JoinPoint jp){
        String s = jp.getArgs()[0].toString();
        System.out.println("Argument which is passed through check out "+s);
    }

    @After("execution(* com.learningTech.ShoppingCrat.checkout(..))")
    public void after_Logger(){
        System.out.println("After Logger called");
    }

    @Pointcut("execute(* com.learningTech.ShoppingCrat.quantity(..))")
    public void afterreturningpointcut(){

    }

    @AfterReturning(pointcut = "afterreturningpointcut()" , returning = "retValue")
    public void afterReturning(String retValue){
        System.out.println("After Returning : ");

    }


}

