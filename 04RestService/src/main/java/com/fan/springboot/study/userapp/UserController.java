package com.fan.springboot.study.userapp;

import com.fan.springboot.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by maobuji on 2017/11/26.
 *
 * 展现了两种不同的处理方式 ResponseBody 和 ResponseEntity的两种不同方式的处理
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/delUser/{id}")
    @ResponseBody
    public void delUser(@PathVariable("id") String userID) {
        userService.deleteUser(userID);
    }

    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> findUser(@PathVariable("id") String userID) throws Exception {
        if(userID.equals("")) {
            throw new Exception();
        }
        User result = userService.findUser(userID);
        HttpStatus status = result != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<User>(result,status);
    }

}

