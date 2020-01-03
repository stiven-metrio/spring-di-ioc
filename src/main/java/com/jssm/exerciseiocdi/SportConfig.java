package com.jssm.exerciseiocdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// Define Bean for our Fortune Service
	@Bean
	public FortuneService greatFortuneService() {
		return new GreatFortuneService();
	}
	
	// Define Bean for SwimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(greatFortuneService());
	}
}
