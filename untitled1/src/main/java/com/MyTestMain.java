package com;
import com.mvcweb_con.subclass.User;
import java.io.*;
import java.util.Arrays;

import com.name.NameTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MyTestMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        NameTest nameTest = context.getBean("NameTest", NameTest.class);
        nameTest.show();
        //SpringApplication.run(MyTestMain.class,args);
        User user = new User("admin","18");
        System.out.println(user);
    }
}
