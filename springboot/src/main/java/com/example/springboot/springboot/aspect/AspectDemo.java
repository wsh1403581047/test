package com.example.springboot.springboot.aspect;

import com.example.springboot.springboot.controller.TestController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {
    Logger logger = LoggerFactory.getLogger(AspectDemo.class);
    @Pointcut("execution(public * com.example.springboot.springboot.controller..*(..))")
    public void aspectTest(){}

    @Before("aspectTest()")
    public void doBefore(){
        logger.info("{}","在方法执行之前启动");
    }
}
