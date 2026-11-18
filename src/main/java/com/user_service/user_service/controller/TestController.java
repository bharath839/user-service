package com.user_service.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class TestController {

    @GetMapping("/user")
    public String test(){
        return  "test user service port 8081";

    }

}
