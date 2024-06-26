package com.tidz.core.entities;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class FunkoCollector implements Stupid {

	@Override
	public String speak() {
		return "Collecting funkos is so fun! Derp";
	}

	@PostConstruct
	public void printPostConstruct() {
		System.out.println("Funko Stupid reddy for stupidity Sir!");
	}

	@PreDestroy
	public void printPreDestroy() {
		System.out.println("Derp errp Funko");
	}
}
