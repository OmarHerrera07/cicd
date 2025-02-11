package com.demo.cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    @GetMapping("/hola")
    public String getMethodName(@RequestParam String param) {
        return "Hola mundo";
    }
    
}
