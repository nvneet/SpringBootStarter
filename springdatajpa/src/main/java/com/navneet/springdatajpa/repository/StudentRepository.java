package com.navneet.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navneet.springdatajpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
