package com.mall.demo.controller;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test2")
    public String getPage(HashMap<String,String> map){
        map.put("title","welcome to spring mvc");
        return "/index";
    }
    
}
