package com.tidz.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tidz.core.entities.MaskUser;
import com.tidz.core.entities.Stupid;

@Configuration
public class MaskConfig {

	@Bean
	public Stupid maskUser() {
		return new MaskUser();
	}
}
