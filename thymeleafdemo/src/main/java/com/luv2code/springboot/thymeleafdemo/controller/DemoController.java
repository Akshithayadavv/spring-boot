package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    //create a mapping for "/hello"

    @GetMapping("/hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("theData",new java.util.Date());

        return "helloworld";
    }
}
