package com.mvcweb_con;
import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo2")
public class DemoAction2 {
    @RequestMapping("/action.action")
    public String demo2()
    {
        System.out.println("Server2 been accessed......");
        return "main2";
    }
}
