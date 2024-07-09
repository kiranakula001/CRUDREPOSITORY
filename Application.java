package com.spring;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.entity.User;
import com.spring.repo.UserRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository rep= context.getBean(UserRepository.class);
		
		User r1= new User(84,"kiran",21,"male","Tadepalligudem");	
		User r2= new User(64,"mukesh",21,"male","hosur");
		User r3= new User(21,"divya",21,"female","chennai");
		User r4= new User(174,"nikitha",22,"female","chennai");
		
		rep.save(r1);
		rep.save(r2);
		rep.save(r3);
		rep.save(r4);
		
		List<User> users =rep.findByGenderAndAge("male",21);
		users.forEach(user->{
			System.out.println(user);
			System.out.println();
			});
		System.out.println("Data inserted To db!!!!");
		System.out.println("------------------------------");
		
		
	}

}
