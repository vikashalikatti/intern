package org.intern.project.repository;

import java.util.List;

import org.intern.project.dto.User_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_repository extends JpaRepository<User_dto, Integer> {

	List<User_dto> findByEmail(String email);

}
