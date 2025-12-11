package com.test.rest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
public class Web {

    @GetMapping("/test23")
    public String test(){
        return "test";
    }
}
