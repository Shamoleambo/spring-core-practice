package com.tidz.core.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
public class RedditUser implements Stupid {

	@Override
	public String speak() {
		return "This was Deboonked! You are a conspiracy theorist! God does not exist!";
	}

	@PostConstruct
	public void printPostConstruct() {
		System.out.println("God is dead Sir!");
	}

	@PreDestroy
	public void printPreDestroy() {
		System.out.println("Errm... derp lerp saw a post on reddit deboooonked!w");
	}
}
