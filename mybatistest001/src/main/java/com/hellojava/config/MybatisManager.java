package com.hellojava.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取mybatis-config.xml文件 创建数据源
 * mybatis 有两个重要的API SqlSession 和数据源之间的一次会话(集成了JDBC中Connection的功能)
 * SqlSessionFactory 采用了工厂模型一个类 这个类主要是创建SqlSession
 * SqlSessionFactory一定根据mybatis-config.xml文件来创建SqlSession
 */
public class MybatisManager {
    //定义SqlSessionFactory
    private static SqlSessionFactory sqlSessionFactory;
    //定义mybatis-config.xml文件的位置
    private static String configFilePath="mybatis-config.xml";

    /**
     * 初始化SqlSessionFactory 1:读取mybatis-config.xml文件
     */
    static{
        try {
            //通过MyBatis的Resources类来读取mybatis-config.xml文件 并转换成文件流
            InputStream inputStream=Resources.getResourceAsStream(configFilePath);
            //SqlSessionFactoryBuilder 是用于构建SqlSessionFactory(调用了build这个方法
            // 通过mybatis-config.xml文件 mybatis-config.xml其实就传递到SqlSessionFactory)
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //现在利用了一个匿名静态块来初始化SqlSessionFactory 但是匿名静态块的执行只是在当前类加载的时候执行一次，
    //后续没有办法再调用以及再执行，如果存在匿名静态块初始化sqlSessionFactory的时候出现问题了，那么需要定义
    //一个备选方案，是一个方法

    //重新构建SqlSessionFactory
    private static void rebilderSqlSessionFactory(){
        try {
            InputStream inputStream=Resources.getResourceAsStream(configFilePath);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSqlSession(boolean bool){
        if(sqlSessionFactory==null)
            rebilderSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession(bool);
        return sqlSession;
    }

    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }

}
