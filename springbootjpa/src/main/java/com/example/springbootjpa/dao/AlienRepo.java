package com.example.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootjpa.model.Alien;

@Repository
// public interface AlienRepo extends CrudRepository <Alien,Integer> {
    public interface AlienRepo extends JpaRepository <Alien,Integer> {

    public List<Alien> findByaname(String tech);

}
