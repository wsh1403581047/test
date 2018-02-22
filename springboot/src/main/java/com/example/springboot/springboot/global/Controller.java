package com.example.springboot.springboot.global;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理
 * */
@ControllerAdvice
public class Controller {
    Logger logger = Logger.getLogger(Controller.class);
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String test(Exception e) throws Exception{
        logger.info(e);
        return "处理异常";
    }
}
