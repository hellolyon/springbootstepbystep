package com.lyon.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lyon.domain.User;
import com.lyon.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.UUID;

/**
 */
@Service
@Slf4j
public class UserService {

    private HashMap<String,User> session = new HashMap<>();

    @Autowired
    UserMapper userMapper;


    public User getUser(String id) {
        User user = userMapper.selectById(id);
        if (ObjectUtils.isEmpty(user)){
            throw new RuntimeException("user is not exit");
        }
        return user;
    }

    public String login(User user) {
        //校验用户名和密码
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,user.getUsername())
                        .eq(User::getPassword,user.getPassword());
        User result = userMapper.selectOne(queryWrapper);
        if (ObjectUtils.isEmpty(result)){
            throw new RuntimeException("用户名或密码错误");
        }
        //生成一个随机uuid作为token 校验通过后往session里面写token
        String uuid = UUID.randomUUID().toString();
        session.put(uuid,result);
        return uuid;
    }
    public User getUsernameFromSession(String token){
        return session.get(token);
    }

}
