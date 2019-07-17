package com.kkalletla.SpringBootProfiles.controller;

import com.kkalletla.SpringBootProfiles.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
   @Autowired
   private Animal animal;
   @GetMapping("/")	
   public String getMessage() {
	   return animal.getMessage();
   }
}
