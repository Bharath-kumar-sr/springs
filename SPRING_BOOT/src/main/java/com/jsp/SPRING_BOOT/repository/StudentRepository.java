package com.jsp.SPRING_BOOT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.SPRING_BOOT.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	public Student findByName(String pk);
}
