package com.test;

import com.Dao.UserDBDao;
import com.mvcweb_con.subclass.UserDB;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDBTest {
    SqlSession sqlSession;
    @Test
    public void test()
    {
        try
        {
            sqlSession = MybatisUtils.getSqlSession();
            //方式一:getMapper
            UserDBDao mapper = sqlSession.getMapper(UserDBDao.class);
            List<UserDB> userList = mapper.getUserList();
            for (UserDB user : userList)
            {
                System.out.println(user);
            }
            sqlSession.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//        finally
//        {
//            sqlSession.close();
//        }        finally
////        {
////            sqlSession.close();
////        }
    }
}
