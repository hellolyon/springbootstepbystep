package com.lyon.frame;

import com.lyon.domain.User;
import com.lyon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class UserInterceptor  implements HandlerInterceptor {
    @Autowired
    private UserService userService;
    private String loginErrorInfo = "please login";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (ObjectUtils.isEmpty(token)){
            response.getWriter().write(loginErrorInfo);
            return false;
        }
        User user = userService.getUsernameFromSession(token);
        if (ObjectUtils.isEmpty(user)){
            response.getWriter().write(loginErrorInfo);
            return false;
        }
        UserUtil.set(user);
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        UserUtil.clean();
    }
}
