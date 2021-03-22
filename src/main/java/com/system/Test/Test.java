package com.system.Test;

import com.system.Dao.StudentDao;
import com.system.Dao.TeacherDao;
import com.system.entity.Student;
import com.system.entity.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:刘守业
 * @Date: 2021/2/26 16:47
 */
public class Test {

    private InputStream inputStream;
    private SqlSessionFactory factory;
    private SqlSession session;
    private StudentDao studentDao;
    private TeacherDao teacherDao;

    @org.junit.Test
    public void testFindOne(){
        List<Teacher> teacherList = teacherDao.findByName("刘老师");
        System.out.println(teacherList);
    }


    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        factory = sessionFactoryBuilder.build(inputStream);
        session = factory.openSession(false);
        teacherDao = session.getMapper(TeacherDao.class);
    }

    @After
    public void destroy(){
        session.commit();
        session.close();
    }

}
