package com.lyon.frame;

import cn.hutool.json.JSONUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice(basePackages = {"com.lyon.controller"})
public class BaseResponseBodyAdvice implements ResponseBodyAdvice<Object> {


    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType,
                                  MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        if (body instanceof BaseResponse) {
            return body;
        } else if (body instanceof String){
            response.getHeaders().set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
            return JSONUtil.toJsonStr(BaseResponse.ok(body));
        }
        else {
            BaseResponse<Object> result = BaseResponse.ok(body);
            return result;
        }
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    BaseResponse handleException(HttpServletRequest request, HttpServletResponse response, HandlerMethod handler, Throwable ex) {
        return BaseResponse.error(ex.getMessage());
    }

}
