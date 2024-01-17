package com.jayong.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/name")
    public String name(){
        return "name";
    }

    @GetMapping("/INU")
    public String school(){
        return "name";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/mylog/list";
    }
}
