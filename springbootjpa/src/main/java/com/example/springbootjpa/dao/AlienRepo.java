package com.example.springbootjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootjpa.model.Alien;

@Repository
public interface AlienRepo extends CrudRepository <Alien,Integer> {

    public List<Alien> findByaname(String tech);

}
