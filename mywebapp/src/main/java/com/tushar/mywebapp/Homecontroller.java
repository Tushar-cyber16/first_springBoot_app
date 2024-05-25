package com.tushar.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroller {

    @RequestMapping("home")
    // @ResponseBody
    public String home(@RequestParam("name") String myname , HttpSession session )
    {
        session.setAttribute("name", myname);
        System.out.println("home controller");
        return "home";
    }
    
}
