package com.kkalletla.SpringBootProfiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfilesApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootProfilesApplication.class);

	public static void main(String[] args) {


		SpringApplication.run(SpringBootProfilesApplication.class, args);
		logger.debug("--Application Started--");
	}
}
