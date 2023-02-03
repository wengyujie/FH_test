package com.mvcweb_con;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpAction {

    /**
     *      1.
     *      之前在springmvc.xml中配置了视图解析器，这是SpringMVC处理页面跳转的默认方式，属于普通转发跳转
     *      会将页面转发到action方法的返回值和前缀后缀拼接形成的路径所对应资源页面
     * @return
     */
    @RequestMapping("JumpActionOne.action")
    public String ActionOne()
    {
        System.out.println("SpringMVC处理页面跳转的默认方式，属于普通转发跳转");
        return "main";
    }

    /**    2.
     *     下面是我们注册的视图解析器的父类：UrlBasedViewResolver，中的几个参数
     *     通过对底层源代码的解读，可知在action方法的返回值字符串中，如果以"redirect:"或者"forward:"开头则不会执行视图解析器的路径拼接
     *     而是会按照redirect或forward完成页面重定向或页面跳转
     *
     *     public static final String REDIRECT_URL_PREFIX = "redirect:";
     *     public static final String FORWARD_URL_PREFIX = "forward:";
     *     private String prefix = "";
     *     private String suffix = "";
     *
     *     注意：不管要使用action的页面转发或者是action的页面重定向，由于action方法是控制器内部的方法
     *     所以要想访问action方法必须访问到控制SpringMVC控制器，而要访问控制器，前提是要能被SpringMVC核心处理器处理(也就是底层的servlet)
     *     而要想被底层servlet处理，必须满足请求路径的通配条件，这是我们在web.xml文件中配置好的"*.action"
     *     所以要在请求的末尾加上".action"以满足请求的通配要求，才有资格被交给SpringMVC的控制器中的方法处理
     */
    @RequestMapping("JumpActionTwo.action")
    public String ActionTwo()
    {
        System.out.println("按照forward,通过控制器完成页面跳转");
        return "forward:/JumpActionOne.action";
    }

    /**
     * 如果是普通重定向，直接重定向到项目资源，不需要控制器中的action方法的处理，请求路径后不用跟".action"，直接写重定向的资源路径即可
     */
    @RequestMapping("JumpActionThree.action")
    public String ActionThree()
    {
        System.out.println("按照redirect,通过直接访问静态资源完成页面重定向");
        return "redirect:/other/test.jsp";
    }

    /**
     * 要在请求的末尾加上".action"以满足请求的通配要求，才有资格被交给SpringMVC的控制器中的方法执行
     */
    @RequestMapping("JumpActionFour.action")
    public String ActionFour()
    {
        System.out.println("按照redirect,通过控制器完成页面重定向");
        return "redirect:/JumpActionThree.action";
    }
}
