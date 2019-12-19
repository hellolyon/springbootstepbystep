package com.skyshit.service;

import com.skyshit.domain.User;
import com.skyshit.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    UserMapper userMapper;


    public User getUser(String id) {
        User user = userMapper.findById(id);
        return user;
    }
}
