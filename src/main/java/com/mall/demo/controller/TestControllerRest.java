package com.mall.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerRest {

    @RequestMapping("/test")
    public String testRest(){
        return "Welcome to Spring rest!";
    }
    
}

