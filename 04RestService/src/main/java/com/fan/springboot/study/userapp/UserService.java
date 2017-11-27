package com.fan.springboot.study.userapp;

import com.fan.springboot.study.domain.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maobuji on 2017/11/26.
 */
@Component
public class UserService {

    private static Map<String, User> users = new HashMap<String, User>();

    public void addUser(User user) {
        users.put(user.getUserID(), user);
    }

    public User findUser(String userID) {
        return users.get(userID);
    }
}
