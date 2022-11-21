package com.SocialMedia.WebServices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SocialMedia.WebServices.User.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	
}
