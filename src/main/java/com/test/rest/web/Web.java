package com.test.rest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Base path for all endpoints in this controller
public class Web {

    @GetMapping("/test234")
    public String test(){
        return "test";
    }
}