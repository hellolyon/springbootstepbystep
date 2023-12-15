package com.lyon.controller;

import com.lyon.domain.User;
import com.lyon.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by skyshit
 */
@RestController
@Slf4j
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable String id) {
        User user = userService.getUser(id);
        return user;
    }
    @PostMapping(value = "/login")
    public String login(@RequestBody User user) {
        return userService.login(user);
    }

    @GetMapping(value = "/error")
    public void getUser() {
        throw new RuntimeException("error");
    }


}
