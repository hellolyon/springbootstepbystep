package com.lyon.frame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    private T data;
    private int code = 0;
    private String message = "success";
    private long srvTime = System.currentTimeMillis();

    public BaseResponse(String message) {
        this.message = message;
    }

    public BaseResponse<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static <T> BaseResponse<T> ok() {
        return new BaseResponse<>();
    }
    public static <T> BaseResponse<T> error(String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(1);
        response.setMessage(message);
        return response;
    }

    public static <T> BaseResponse<T> ok(T data) {
        return new BaseResponse<T>().setData(data);
    }

}
