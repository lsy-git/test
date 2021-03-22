package com.system.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {

    public static void main(String[] args) throws IOException {

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(inputStream);
        //使用工厂生产SqlSession的对象
        SqlSession session = sessionFactory.openSession();
        //使用uermapper创建mapper接口的代理对象
//        Uermapper uermapper = session.getMapper(Uermapper.class);
        //使用代理对象执行方法
//        List<User> users = uermapper.findAll();
//        for (User u: users){
//            System.out.println(u.getId());
//            System.out.println(u.getName());
//            System.out.println(u.getAge());
//            System.out.println(u.getPassword());
//        }
        //释放资源
        session.close();
        inputStream.close();



    }
}
