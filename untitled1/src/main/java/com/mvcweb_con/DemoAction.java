package com.mvcweb_con;
import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务管理器：包含很多完成具体需求的方法
 */
@Controller
@RequestMapping("demo1")
public class DemoAction {
    /**
     * DemoAction中的所有功能实现都是由方法来完成的
     * 这些方法的规范
     *  1.访问权限：public
     *  2.方法的返回值：任意
     *  3.方法名称：任意
     *  4.方法参数：可以没有，如果有可以是任意类型
     *  5.注解：需要使用@RequestMapping注解来声明一个访问路径(名称)，这里不用再写：demo.action项目请求路径后面的后缀
     *  因为该后缀是给web.xml中注册的DispatcherServlet看的，起到拦截请求的作用，符合拦截要求的请求才交给底层servlet处理
     */
    @RequestMapping("/action.action")
    public String demo()
    {
        System.out.println("Server1 been accessed......");
        return "main";
    }

}
