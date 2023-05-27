package com.postgres.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import com.postgres.DTO.StudentInfoDTO;
import com.postgres.service.StudentService;

class StudentControllerTest {
	
	@Mock
	StudentService studentService ;
	
	@InjectMocks
	StudentController studentController;

	
	@Test
	public void getAllStudentTest()
	{
		//List<StudentInfoDTO> s = new ArrayList<>();
		StudentInfoDTO s = new StudentInfoDTO();
		List<StudentInfoDTO> stu = new ArrayList<>();
		s.setName("Pankaj");
		s.setId(1);
		s.setPassword("Abc");
		s.setUsername("Pasalkar");
		stu.add(s);
		when(studentService.getStudents()).thenReturn(stu);
		
		List<StudentInfoDTO> resul = (List<StudentInfoDTO>) studentController.getAllStudent();
		assertEquals(stu,resul);
	}

}
