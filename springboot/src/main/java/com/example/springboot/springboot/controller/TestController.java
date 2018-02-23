package com.example.springboot.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("toTest")
    public String test(){
        logger.info("测试toTest方法");
        return "123";
    }
}
