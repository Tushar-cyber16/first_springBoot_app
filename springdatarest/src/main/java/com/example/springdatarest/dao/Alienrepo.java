package com.example.springdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springdatarest.model.Alien;


@RepositoryRestResource(path="aliens" , collectionResourceRel = "aliens")
public interface Alienrepo extends JpaRepository <Alien,Integer> {

}
