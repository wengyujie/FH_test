package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory->SqlSession
public class MybatisUtils {
    public static SqlSessionFactory sqlSessionFactory;
    //使用mybatis第一步，获取SqlSessionFactory对象
    static
    {
        try
        {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //有了SqlSessionFactory，就可以从中获取SqlSession实例
    //SqlSession完全包含面向数据库执行sql命令所需的所有方法
    public static SqlSession getSqlSession()
    {
        return sqlSessionFactory.openSession();
    }
}
