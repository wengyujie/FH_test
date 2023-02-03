package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import  java.util.*;
@Controller
@RequestMapping("mvc")
public class testColtroller {
    //@ResponseBody
    @RequestMapping("hello")
    public String Hello(Model model)
    {
         Map<String, String> map = new HashMap<>();
        map.put("a","adda");
        map.put("b","addb");
        map.put("c","addc");
        map.put("d","addd");
        model.addAttribute("msg","springboot");
        model.addAttribute("username","admin");
        model.addAttribute("mapval",map);
        return "success";
    }
}
