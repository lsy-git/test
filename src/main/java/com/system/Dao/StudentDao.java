package com.system.Dao;

import com.system.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:刘守业
 * @Date: 2021/3/21 8:07
 */
public interface StudentDao {

    /**
     * 一对一查询，查询每个学生对应的老师
     * @param name
     * @return
     */
    Student findByName(String name);

    /**
     * 查询所有
     * @return
     */
    List<Student> findAll();

    /**
     * 根据地址模糊查询
     * @param name
     * @return
     */
    List<Student> findByAddress(@Param("value") String name);

    /**
     * 模糊查询2
     * @param name
     * @return
     */
    List<Student> findByAddrss2(String name);
}
