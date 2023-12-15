package com.lyon.frame;

import com.lyon.domain.User;

public class UserUtil {
    public static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public static void set(User user) {
        userThreadLocal.set(user);
    }

    public static void clean() {
        userThreadLocal.remove();
    }

    public static User getUser() {
        return userThreadLocal.get();
    }
}
