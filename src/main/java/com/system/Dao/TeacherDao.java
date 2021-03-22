package com.system.Dao;

import com.system.entity.Teacher;

import java.util.List;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 9:47
 */
public interface TeacherDao {

    List<Teacher> findByName(String name);
}
