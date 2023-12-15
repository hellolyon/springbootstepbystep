package com.lyon.controller;

import com.lyon.domain.User;
import com.lyon.frame.UserUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/getName")
    public User getName() {
        return UserUtil.getUser();
    }

}