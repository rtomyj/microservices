package com.rtomyj.udemy.microservices.microservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import com.rtomyj.udemy.microservices.microservices.Lab1.model.Player;
import com.rtomyj.udemy.microservices.microservices.Lab1.model.Team;
import com.rtomyj.udemy.microservices.microservices.Lab1.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication extends /* Needed to create WAR*/ SpringBootServletInitializer
{

	@Autowired
	private TeamRepository teamRepository;

	/**
	 * Creates JAR
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

	/**
	 * Creates WAR when a WAR is to be generated
	 * Overrides default of making a JAR with WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(DemoApplication.class);
	}


	@PostConstruct
	public void init()
	{
		List<Team> teams = new ArrayList();

		teams.add(Team
			.builder()
			.name("Bulls")
			.mascot("Bull")
			.location("Chicago")
			.players(
				new HashSet<Player>(Arrays.asList(
					new Player[]
					{
						Player.builder().name("Rayn Arcidiacono").position("Guard").build()
						, Player.builder().name("Wendell Carter JR.").position("Center / Forward").build()
					}
				))
			)
			.build());

		teams.add(Team
			.builder()
			.name("Bears")
			.mascot("Bear")
			.location("Chicago")
			.players(
				new HashSet<Player>(Arrays.asList(
					new Player[]
					{
						Player.builder().name("Tyler Bray").position("QB").build()
						, Player.builder().name("Nick Foles").position("QB").build()
					}
				))
			)
			.build());

		teams.add(Team
			.builder()
			.name("Cubs")
			.mascot("Bear")
			.location("Chicago")
			.build());


		teamRepository.saveAll(teams);
	}

}
