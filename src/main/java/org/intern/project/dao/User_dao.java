package org.intern.project.dao;

import java.util.List;

import org.intern.project.dto.User_dto;
import org.intern.project.repository.User_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User_dao {
	
	@Autowired
	User_repository user_repository;
	
	public User_dto save(User_dto dto) {
		return user_repository.save(dto);
	}

	public User_dto fetch(String email) {
		List<User_dto> dto=user_repository.findByEmail(email);
		if(dto==null || dto.isEmpty())
		return null;
		else
		return dto.get(0);
	}
}
