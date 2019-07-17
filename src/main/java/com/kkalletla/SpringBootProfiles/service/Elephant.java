package com.kkalletla.SpringBootProfiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("animal_elephant")
public class Elephant implements Animal {
	@Override
	public String getMessage() {
		return "Hello from Elephant!";
	}

}
