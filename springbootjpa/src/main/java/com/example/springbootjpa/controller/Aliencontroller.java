package com.example.springbootjpa.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




// @Controller
@RestController // now no need to mention response body everywhere for rest app
public class Aliencontroller {

    @Autowired
    AlienService service;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @PostMapping("/addAlien")
    public Alien addAlien(@RequestBody Alien alien) {

        service.saveorupdate(alien);
        return alien;
    }

    @GetMapping("/getAlien")
    public List<Alien> getAlien() {
        // ModelAndView mv = new ModelAndView();
        
        // System.out.println(service.findByaname("TUSHAR"));
        // mv.addObject("obj", service.getAlien());
        // mv.setViewName("allAlien.jsp");
        // return mv;
        // System.out.println(service.getAlien());
        // return "home.jsp";

        return service.getAlien();
    }

    @GetMapping("/alien/{aid}")
    // @ResponseBody
    public Optional<Alien> alienbyid(@PathVariable("aid") int aid) {
        return service.getalienbyid(aid);
    }
    
    
    
    
}
