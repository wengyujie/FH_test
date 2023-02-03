package com.mvcweb_con;
import com.mvcweb_con.subclass.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dataSubmit")
public class DataSubmit {
    //直接注入
    @RequestMapping("/submit01.action")
    public String dataSubmit01(String name, int age)
    {
        System.out.println("name = " + name + ", age = " + age);
        return "dataSubmit";
    }

    //封装成实体类来获取
    //SpringMVC自动创建实体类对象，并将前端提交的数据，注入到User实体类中的对应属性中
    @RequestMapping("/submit02.action")
    public String dataSubmit02(User user){
        System.out.println(user);
        return "dataSubmit";
    }

    //动态占位符获取数据

    /**
     *     目标路径后用大括号接住前端随着地址携带来的数据，括号用斜杠分割开，
     *     括号内名称和@PathVariable后面的注解名一致，将携带的数据注入给
     *     目标方法中的对应变量
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/submit03.action/{name}/{age}")
    public String dataSubmit03(
            @PathVariable("name")
            String name,
            @PathVariable("age")
            int age)
    {
        System.out.println("name = " + name + ", age = " + age);
        return "dataSubmit";
    }

    //参数名称不一致时获取数据
    /**
     * 若前端数据名和后端变量名不一致，
     * 则可以将@RequestParam注解名
     * 和前端传来的数据名称保持一致，
     * 这样将前端数据传给注解标识的变量.
     * 即，只需要保证@RequestParam与
     * 前端一致就行
     * @param uname
     * @param uage
     * @return
     */
    @RequestMapping("/submit04.action")
    public String dataSubmit04(
            @RequestParam("name")
            String uname,
            @RequestParam("age")
            int uage){
        System.out.println("name = " + uname + ", age = " + uage);
        return "dataSubmit";
    }

    //手工获取前端提交的数据
    /**
     * 就是传统servlet开发时获取前端数据的方式，
     * 只不过这里HttpServletRequest实例对象由
     * SpringMVC框架自动创建
     */
    @RequestMapping("/submit05.action")
    public String dataSubmit05(HttpServletRequest httpServletRequest)
    {
        String name = httpServletRequest.getParameter("name");
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        System.out.println("name = " + name + ", age = " + age);
        return "dataSubmit";
    }
}
