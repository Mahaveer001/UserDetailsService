package com.userdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdetails.dao.UserDetailsDao;
import com.userdetails.model.UserDetails;

@Service("userDetailsService")
public class UserDetailsService {

	@Autowired
	UserDetailsDao userDetailsDao;
	
	public List<UserDetails> listAllUsers() {

		 List<UserDetails> ls=(List<UserDetails>) userDetailsDao.findAll();
		 System.out.println("inside listall service "+ls.size());
		 return ls;
	}
	public Optional<UserDetails> getUser(int id) {

		 Optional<UserDetails> user= userDetailsDao.findById(id);
		 
		 return user;
	}

}
