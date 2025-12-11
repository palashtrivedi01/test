package com.test.rest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
public class Web {

    @RequestMapping("/test2")
    public String test(){
        return "test";
    }
}
