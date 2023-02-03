package com.mvcweb_con;

import com.mvcweb_con.subclass.UserBirthday;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("showDate")
public class ShowDate {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    //注册全局日期处理注解
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        //注册自定义的编辑器，对日期进行自定义配置,指定日期注入时格式，允许日期为空
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @RequestMapping("showBirthdat.action")
    public String ShowBirthdayInfo(HttpServletRequest request)throws ParseException
    {
        UserBirthday u1 = new UserBirthday("荷包蛋", simpleDateFormat.parse("2002-08-23"));
        UserBirthday u2 = new UserBirthday("饺子", simpleDateFormat.parse("2001-08-28"));
        UserBirthday u3 = new UserBirthday("橘子", simpleDateFormat.parse("2001-03-14"));
        List<UserBirthday> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        request.setAttribute("list", list);
        return "ShowDate";
    }
}
