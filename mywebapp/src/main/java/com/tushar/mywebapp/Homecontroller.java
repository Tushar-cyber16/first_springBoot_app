package com.tushar.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroller {

    @RequestMapping("home")
    // @ResponseBody
    public ModelAndView home(Alien alien )
    {
       ModelAndView mv = new ModelAndView();

       mv.addObject("obj", alien);
       mv.setViewName("home");
       
       return mv;
    }
    
}
