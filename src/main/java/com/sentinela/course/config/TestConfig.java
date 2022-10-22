package com.sentinela.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sentinela.course.entities.User;
import com.sentinela.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Steve Rogers", "steve@gmail.com", "912345678", "123456");
		User u2 = new User(null, "Peter Parker", "peter@gmail.com", "987654321", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
