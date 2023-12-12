package com.lyon.service;

import com.lyon.domain.User;
import com.lyon.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    UserMapper userMapper;


    public User getUser(String id) {
        User user = userMapper.selectById(id);
        if (ObjectUtils.isEmpty(user)){
            throw new RuntimeException("user is not exit");
        }
        return user;
    }
}
