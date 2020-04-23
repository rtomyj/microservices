package com.rtomyj.udemy.microservices.microservices.Lab1.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@JacksonXmlRootElement(localName = "team")
public class Team {
	@Id
	@GeneratedValue
	private long id;

	private String name, location, mascot;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Set<Player> players;
}