package com.lyon.controller;

import com.lyon.domain.User;
import com.lyon.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @RequestMapping(value = "/{id}",method= RequestMethod.GET)
    public User getUser(@PathVariable String id){
        log.info("param id is {}",id);
        User user = userService.getUser(id);
        return user;
    }



}
