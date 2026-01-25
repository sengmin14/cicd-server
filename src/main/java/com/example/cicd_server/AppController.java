package com.example.cicd_server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String hello() {
        return "cicd 됨?123";
    }

}
