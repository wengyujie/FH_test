package com.mvcweb_con;
import com.Dao.CoordianteTableDao;
import com.Dao.UserDBDao;
import com.mvcweb_con.subclass.CoordianteTable;
import com.mvcweb_con.subclass.Coordinate;
import com.mvcweb_con.subclass.User;
import com.mvcweb_con.subclass.UserDB;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("ajaxrequest")
public class AjaxRequestAction {
    SqlSession sqlSession;
    //User类含有属性:name(String), age(int)，无参和全参构造方法，全属性的getter,setter,toString方法
    @RequestMapping("list.action")
    @ResponseBody
    public List<User> ajaxRequest(){
        System.out.println("jquery use success");
        List<User> userList = new ArrayList<>();
        try
        {
            sqlSession = MybatisUtils.getSqlSession();
            //方式一:getMapper
            UserDBDao mapper = sqlSession.getMapper(UserDBDao.class);
            List<UserDB> userDBList = mapper.getUserList();
            for (UserDB user : userDBList)
            {
                System.out.println(user);
                User user1 = new User(user.getUsername(),user.getPassword());
                userList.add(user1);
            }
            sqlSession.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//        User user1 = new User("d1","18");
//        userList.add(user1);
//        User user2 = new User("d2","19");
//        userList.add(user2);
//        User user3 = new User("d3","20");
//        userList.add(user3);
//        User user4 = new User("d4","21");
//        userList.add(user4);
//        User user5 = new User("d5","22");
//        userList.add(user5);
//        System.out.println(user5);
        //return userList;
        return userList;
    }

    @RequestMapping("test.action")
    @ResponseBody
    public String ajaxRequestTest(){
        System.out.println("jquery use success");

        return "jquery use success";
    }

    @RequestMapping("getCoordinate.action")
    @ResponseBody
    public Coordinate getCoordinate() {
        System.out.println("Start Get Coordiante Data");
        Coordinate coordinate = new Coordinate();
        try
        {
            sqlSession = MybatisUtils.getSqlSession();
            //方式一:getMapper
            CoordianteTableDao mapper = sqlSession.getMapper(CoordianteTableDao.class);
            List<CoordianteTable> coordinateTableList = mapper.getCoordinateList();
            for (CoordianteTable coordinateTable : coordinateTableList)
            {
                System.out.println(coordinateTable);
                coordinate.insertX(coordinateTable.getX());
                coordinate.insertY(coordinateTable.getY());
            }
            sqlSession.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return coordinate;
    }
}
