package com.microdata.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.microdata.dto.User;
import com.microdata.repo.UserRepository;

@Singleton
public class CrudService {
	
	@Inject
	UserRepository UserRepository;
	
	CrudService(){}
	
	
	
	
	public List<User> getname() {
		
		//UserRepository.findAll();
		
		return (List<User>) UserRepository.findAll();
	}
	
	public User saveOrupdateUser(User obj) {
		User uobj = null;
		if ( UserRepository.existsById(obj.getId())) {
		   uobj = UserRepository.update(obj);
		  } else {
		   uobj = UserRepository.save(obj);
		  }
		return uobj;
		}




	public void deleteUser(Long id) {
		
		UserRepository.deleteById(id);
		
	}

}
