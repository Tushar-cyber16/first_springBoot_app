package com.example.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootjpa.model.Alien;

public interface AlienRepo extends CrudRepository <Alien,Integer>{

}
