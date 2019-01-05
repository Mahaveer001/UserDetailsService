package com.userdetails.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.userdetails.model.UserDetails;

public interface UserDetailsDao  extends JpaRepository<UserDetails, Integer>{

	public List<UserDetails> findAll();
	public Optional<UserDetails> findById(Integer id);
}
