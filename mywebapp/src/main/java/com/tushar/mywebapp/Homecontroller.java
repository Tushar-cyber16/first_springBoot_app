package com.tushar.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroller {

    @RequestMapping("home")
    // @ResponseBody
    public String home(HttpServletRequest req )
    {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");

        session.setAttribute("name", name);
        System.out.println("home controller");
        return "home";
    }
    
}
