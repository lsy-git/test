package com.system.entity;

import java.io.Serializable;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 8:00
 */
public class User implements Serializable {

    private Integer id;
    private String sex;
    private String address;

    public User() {
    }

    public User(Integer id, String sex, String address) {
        this.id = id;
        this.sex = sex;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
