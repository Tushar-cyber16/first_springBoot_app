package com.example.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootjpa.dao.AlienRepo;
import com.example.springbootjpa.model.Alien;



@Controller
public class Aliencontroller {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @PostMapping("/addAlien")
    public String addAlien(Alien alien) {

        repo.save(alien);
        return "home.jsp";
    }
    
    
}
