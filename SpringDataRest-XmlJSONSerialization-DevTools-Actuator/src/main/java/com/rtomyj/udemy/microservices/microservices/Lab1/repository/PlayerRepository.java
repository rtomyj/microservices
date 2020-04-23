package com.rtomyj.udemy.microservices.microservices.Lab1.repository;

import com.rtomyj.udemy.microservices.microservices.Lab1.model.Player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="player")	// opens up endpoint to this Crud repository no longer needing the controller or service layer.
public interface PlayerRepository extends CrudRepository<Player, Long>
{

}