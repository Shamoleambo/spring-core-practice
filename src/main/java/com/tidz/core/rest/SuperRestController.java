package com.tidz.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tidz.core.entities.Stupid;

@RestController
@RequestMapping("/api")
public class SuperRestController {

	private Stupid stupid;

	@Autowired
	public SuperRestController(@Qualifier("funkoCollector") Stupid stupid) {
		this.stupid = stupid;
	}

	@GetMapping("/stupidSays")
	public String checksForTheStupid() {
		return this.stupid.speak();
	}
	
}
