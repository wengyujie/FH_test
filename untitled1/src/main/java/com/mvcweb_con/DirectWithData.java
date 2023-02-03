package com.mvcweb_con;

import com.mvcweb_con.subclass.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("DirectWithData")
public class DirectWithData {
    @RequestMapping("JumpWithData.action")
    public String JumpWithData(HttpServletRequest httpServletRequest,
                               HttpSession httpSession,
                               Model model,
                               ModelMap modelMap,
                               Map<Object, Object> map)
    {
        User user = new User("abcd", "20");
        //将user对象利用各SpringMVC内置对象存放到相应作用域中
        httpServletRequest.setAttribute("request", user);
        httpSession.setAttribute("session", user);
        model.addAttribute("model", user);
        modelMap.addAttribute("modelmap", user);
        map.put("map", user);
        //最后完成页面转发跳转
        return "forward:/other/WithData.jsp";
    }

    @RequestMapping("RedirectWithData.action")
    public String RedirectWithData(HttpServletRequest httpServletRequest,
                               HttpSession httpSession,
                               Model model,
                               ModelMap modelMap,
                               Map<Object, Object> map)
    {
        User user = new User("abcd", "20");
        //将user对象利用各SpringMVC内置对象存放到相应作用域中
        httpServletRequest.setAttribute("request", user);
        httpSession.setAttribute("session", user);
        model.addAttribute("model", user);
        modelMap.addAttribute("modelmap", user);
        map.put("map", user);
        //最后完成页面转发跳转
        return "redirect:/other/WithData.jsp";
    }
}
