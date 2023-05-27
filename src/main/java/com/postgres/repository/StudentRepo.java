package com.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.postgres.DTO.StudentInfoDTO;
import com.postgres.Entity.StudentInfo;

public interface StudentRepo extends JpaRepository<StudentInfo, String> {

	StudentInfo findByUsername(String username);
	StudentInfo findById(int id);

}
