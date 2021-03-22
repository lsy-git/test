package com.system.entity;

import java.io.Serializable;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 7:57
 */
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Integer tid;

    //一对一
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer tid, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }
}
