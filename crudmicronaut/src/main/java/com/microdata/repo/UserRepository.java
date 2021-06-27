package com.microdata.repo;
import java.util.List;

import com.microdata.dto.User;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { 
   
	//@Executable
   // User find(String title);

	@Executable
	List<User> findAll();
}