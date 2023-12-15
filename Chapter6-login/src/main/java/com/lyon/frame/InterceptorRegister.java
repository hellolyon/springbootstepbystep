package com.lyon.frame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorRegister implements WebMvcConfigurer {

    @Autowired
    UserInterceptor userInterceptor;
    /**
     * 添加拦截器，并配置拦截地址
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> pathPatterns = new ArrayList<>();
        pathPatterns.add("/api/user/login");
        registry.addInterceptor(userInterceptor).excludePathPatterns(pathPatterns);
    }
}
