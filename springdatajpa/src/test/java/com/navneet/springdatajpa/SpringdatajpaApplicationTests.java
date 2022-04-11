package com.navneet.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.navneet.springdatajpa.model.Student;
import com.navneet.springdatajpa.repository.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudent() {
		Student student = new Student(1L, "Suraj", 95);		
		repository.save(student);
		
		Student savedStudent = repository.findById(1L).get();
		
		assertNotNull(savedStudent);
	}
}
