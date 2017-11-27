package com.fan.springboot.study.userapp;

import com.fan.springboot.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by maobuji on 2017/11/26.
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public boolean addUser() {

        User user = new User();
        user.setUserID("1");
        user.setUserName("fan");
        user.setUserDesc("test user");
        userService.addUser(user);
        return true;
    }

    @RequestMapping(value = "/queryUser")
    @ResponseBody
    public User queryUser(String userID) {
        return userService.findUser(userID);
    }

    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> findUser(@PathVariable("id") String userID) throws Exception {
        User result = userService.findUser(userID);
        HttpStatus status = result != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
 //       if(result == null){
 //           throw new Exception(userID);
 //       }
        return new ResponseEntity<User>(result,status);
    }

}

