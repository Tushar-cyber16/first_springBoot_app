package com.tushar.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {

    @RequestMapping("home")
    // @ResponseBody
    public String home()
    {
        System.out.println("home controller");
        return "home.jsp";
    }
    
}
