package com.rtomyj.udemy.microservices.microservices.Lab1.controller;

import com.rtomyj.udemy.microservices.microservices.Lab1.model.Team;
import com.rtomyj.udemy.microservices.microservices.Lab1.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}

	@GetMapping("/teams/{teamId}")
	public Team getTeam(@PathVariable final long teamId)
	{
		return teamRepository.findById(teamId).get();
	}
}