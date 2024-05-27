package com.example.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootjpa.dao.AlienRepo;
import com.example.springbootjpa.model.Alien;
import com.example.springbootjpa.service.AlienService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class Aliencontroller {

    @Autowired
    AlienService service;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @PostMapping("/addAlien")
    public String addAlien(Alien alien) {

        service.saveorupdate(alien);
        return "home.jsp";
    }

    @GetMapping("/getAlien")
    public ModelAndView getAlien() {
        ModelAndView mv = new ModelAndView();
        
        System.out.println(service.findByaname("TUSHAR"));
        mv.addObject("obj", service.getAlien());
        mv.setViewName("allAlien.jsp");
        return mv;
        // System.out.println(service.getAlien());
        // return "home.jsp";
    }

    @GetMapping("/alien/{aid}")
    @ResponseBody
    public String alienbyid(@PathVariable("aid") int aid) {
        return service.getalienbyid(aid);
    }
    
    
    
    
}
