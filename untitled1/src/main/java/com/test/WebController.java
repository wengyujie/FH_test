package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//注意,如果这里使用的是@RestController那么就不会跳转到/webapp下指定的test.jsp而是直接返回字符串test.jsp到响应页面
//@RestController
@Controller
public class WebController {
    @RequestMapping("/teststring")
    public String teststring()
    {
        return "Hellow teststring()";
    }

    @RequestMapping("/testjsp")
    public String testjsp()
    {
        return "test.jsp";
    }
}
