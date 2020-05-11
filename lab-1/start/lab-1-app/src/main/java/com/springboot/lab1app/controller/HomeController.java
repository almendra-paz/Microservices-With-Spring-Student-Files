package com.springboot.lab1app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    private String getMessage(){
        return "hello";
    }

}
