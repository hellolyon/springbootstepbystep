package com.lyon.service;

import com.lyon.domain.User;
import com.lyon.mapper.UserMapper;
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
        User user = userMapper.selectById(id);
        return user;
    }

    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
