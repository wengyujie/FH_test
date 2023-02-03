package com.mvcweb_con;
import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ReqAction")
public class ReqAction {
    /**
     * 新增控制器：ReqAction，在@RequestMapping注解后可以跟两个参数
     * value参数负责对应请求路径，只有正确请求路径下的目标action方法，才可能被调用
     * method参数负责指定该action方法负责响应的请求类型
     * 仅是请求路径对应上并不可以调用action方法，必须请求路径和请求方式都对上，相应的action方法才会被调用
     * @return
     */
    @RequestMapping(value = "/req.action", method = RequestMethod.GET)
    public String reqget()
    {
        System.out.println("Server ReqAction Get been accessed......");
        return "mainGet";
    }

    @RequestMapping(value = "/req.action", method = RequestMethod.POST)
    public String reqpost()
    {
        System.out.println("Server ReqAction Post been accessed......");
        return "mainPost";
    }
}
