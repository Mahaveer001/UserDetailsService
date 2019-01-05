package com.userdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.model.UserDetails;
import com.userdetails.service.UserDetailsService;

@RestController
@RequestMapping("/")
public class UserDetailsController {

	@Autowired
	UserDetailsService userDetailsService;
	
	/*@Bean
	public UserDetailsService userDetailsService() {
	    return (new UserDetailsService());
	}*/
	
	@Autowired
	UserDetails userDetails;
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public List listAllUsers(){
		System.out.println("in controllwer");
		List<UserDetails> ls= userDetailsService.listAllUsers();
		System.out.println(ls.size());
	//return "hello";
		return ls;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<UserDetails> getUser(@PathVariable(value = "id") Integer userId) {
		
		Optional<UserDetails> user= userDetailsService.getUser(userId);
	
	//return "hello";
		return user;
	}
}
