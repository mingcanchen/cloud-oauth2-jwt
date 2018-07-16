package com.ming.web;

import com.ming.dto.UserLoginDTO;
import com.ming.entity.User;
import com.ming.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chenmingcan
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        //参数判断，省略
        return userServiceDetail.insertUser(username, password);
    }

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username, @RequestParam("password") String password) {
        //参数判断，省略
        return userServiceDetail.login(username, password);
    }
}
