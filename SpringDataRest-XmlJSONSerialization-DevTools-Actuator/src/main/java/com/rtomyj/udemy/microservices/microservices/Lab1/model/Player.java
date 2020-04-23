package com.rtomyj.udemy.microservices.microservices.Lab1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JacksonXmlRootElement(localName = "Player")
public class Player {
	@Id
	@GeneratedValue
	private long id;

	private String name, position;
}