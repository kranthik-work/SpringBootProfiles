package com.kkalletla.SpringBootProfiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("animal_lion")
public class Lion implements Animal {
	//@Override
	public String getMessage() {
		return "Hello from Lion!";
	}
}
