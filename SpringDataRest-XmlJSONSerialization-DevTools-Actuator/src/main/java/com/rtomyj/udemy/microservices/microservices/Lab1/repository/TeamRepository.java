package com.rtomyj.udemy.microservices.microservices.Lab1.repository;

import com.rtomyj.udemy.microservices.microservices.Lab1.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>
{

}