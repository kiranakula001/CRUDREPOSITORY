package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.entity.players;
import com.spring.repository.playerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		playerRepo prep= context.getBean(playerRepo.class);
		
		players p1= new players();
		p1.setNumber(45);
		p1.setPlayerAge(33);
		p1.setPlayerName("Klassen");
		p1.setPlayerRuns(890);
		prep.save(p1);
		
	}

}
