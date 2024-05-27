package com.example.springbootjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootjpa.dao.AlienRepo;
import com.example.springbootjpa.model.Alien;

@Service
public class AlienService {

    @Autowired
    AlienRepo repo;

    public void saveorupdate(Alien alien)
    {
         repo.save(alien);
    }

    public List<Alien> getAlien()
    {
        // List<Alien> aliens = new ArrayList<Alien>();
        // repo.findAll().forEach(alien -> aliens.add(alien));

        // return aliens;
        return repo.findAll();
        
    }
    public List<Alien> findByaname(String aname)
    {
        List<Alien> aliens = new ArrayList<Alien>();
        repo.findByaname(aname).forEach(alien -> aliens.add(alien));

        return aliens;
        
    }
    
    public Optional<Alien> getalienbyid(int aid)
    {
        return repo.findById(aid);
        
    }

}
