package com.microdata.controller;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;

import javax.inject.Inject;

import com.microdata.dto.User;
import com.microdata.services.CrudService;

import java.util.List;

@Controller("/app")
public class AppController {
	
	@Inject
    CrudService crudService;
	
	 @Get("/")
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<User> getUsers() {
	    	
	        return crudService.getname();
	    }

	 
	    @Post("/saveuser")
	    @Produces(MediaType.APPLICATION_JSON)
	    public User saveUser(@Body User obj) {
	    	
	        return crudService.saveOrupdateUser(obj);
	    }
	    
	    @Delete("/delete/{id}")
	    public HttpResponse delete(Long id) {
	    	crudService.deleteUser(id);
	    return HttpResponse.ok();
	    }
	    
	    
	    
}
