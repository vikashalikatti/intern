package org.intern.project.dao;

import java.util.List;
import java.util.Optional;

import org.intern.project.dto.Insert_dto;
import org.intern.project.repository.Insert_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Insert_dao {
	@Autowired
	Insert_repository insert_repository;

	public Insert_dto save(Insert_dto insert) {
		return insert_repository.save(insert);
	}

	public Insert_dto fetchbyid(int id) {
		Optional<Insert_dto> optional = insert_repository.findById(id);
		if (optional.isPresent())
			return optional.get();
		else {
			return null;
		}
	}

	public List<Insert_dto> fetchall() {
		return insert_repository.findAll();
	}
	
	public void delete(int id) {
		insert_repository.deleteById(id);
	}
}
