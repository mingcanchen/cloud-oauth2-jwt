package com.ming.dto;

import com.ming.entity.JWT;
import com.ming.entity.User;

/**
 * @author chenmingcan
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
