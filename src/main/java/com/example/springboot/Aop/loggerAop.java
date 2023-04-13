package com.example.springboot.Aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class loggerAop {
    private static final Logger logger=LoggerFactory.getLogger(loggerAop.class);

    @Pointcut("execution(* com.example.springboot.Controller.TestController.*(..))")
    public void pointcut(){}




    @Before("pointcut()")
    public void testbefore(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().getName());
        System.out.println((joinPoint.getSignature().getName()));
    }

}
