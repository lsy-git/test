package com.system.entity;

import java.io.Serializable;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 8:02
 */
public class User_role implements Serializable {

    private Integer user_id;
    private Integer role_id;

    public User_role() {
    }

    public User_role(Integer user_id, Integer role_id) {
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User_role{" +
                "user_id=" + user_id +
                ", role_id=" + role_id +
                '}';
    }
}
