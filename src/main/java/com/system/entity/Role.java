package com.system.entity;

import java.io.Serializable;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 8:03
 */
public class Role implements Serializable {

    private Integer no;
    private String role_name;
    private String role_driect;

    public Role() {
    }

    public Role(Integer no, String role_name, String role_driect) {
        this.no = no;
        this.role_name = role_name;
        this.role_driect = role_driect;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_driect() {
        return role_driect;
    }

    public void setRole_driect(String role_driect) {
        this.role_driect = role_driect;
    }

    @Override
    public String toString() {
        return "Role{" +
                "no=" + no +
                ", role_name='" + role_name + '\'' +
                ", role_driect='" + role_driect + '\'' +
                '}';
    }
}
