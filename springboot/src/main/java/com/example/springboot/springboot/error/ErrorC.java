package com.example.springboot.springboot.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorC {
    @RequestMapping("11")
    @ResponseBody
    public String s(){
        int a = 1/0;
        return "120";
    }
}
