package com.spring.repo;




import java.util.List;


//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
	
	
	public List<User> findByGenderAndAge(String gender,int age );
}
