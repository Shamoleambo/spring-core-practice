package com.tidz.core.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RedditUser implements Stupid {

	@Override
	public String speak() {
		return "This was Deboonked! You are a conspiracy theorist! God does not exist!";
	}
}
