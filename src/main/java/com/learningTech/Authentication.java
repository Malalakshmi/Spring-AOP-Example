package com.learningTech;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authentication {
    // we defined the pointcuts
    @Pointcut("within(com.learningTech..*)")
    public void authenticatingpointcut(){

    }
    @Pointcut("within(com.learningTech..*)")
    public void autherizationpointcut(){

    }

    //to call the point cut
    @Before("authenticatingpointcut() && authenticatingpointcut()")
    public void Authentication(){
        System.out.println("authenticating the request");
    }

}
