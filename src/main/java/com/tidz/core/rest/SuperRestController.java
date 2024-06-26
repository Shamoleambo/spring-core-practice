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
	private Stupid stupidToCheck;

	@Autowired
	public SuperRestController(@Qualifier("funkoCollector") Stupid stupid,
			@Qualifier("funkoCollector") Stupid stupidToCheck) {
		this.stupid = stupid;
		this.stupidToCheck = stupidToCheck;
	}

	@GetMapping("/stupidSays")
	public String checksForTheStupid() {
		return this.stupid.speak();
	}

	@GetMapping("/isEqual")
	public boolean checkInstance() {
		return this.stupid == this.stupidToCheck;
	}

}
