package com.tidz.core.entities;

import org.springframework.stereotype.Component;

@Component
public class FunkoColelctor implements Stupid {

	@Override
	public String speak() {
		return "Collecting funkos is so fun! Derp";
	}
}
