package com.jsp.SPRING_BOOT.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.SPRING_BOOT.dto.Student;
import com.jsp.SPRING_BOOT.repository.StudentRepository;

@Component
public class Operations {
	@Autowired
	StudentRepository repository;

	public void insert(Student student) {
		repository.save(student);
	}

	public void delete(Student student) {
		repository.deleteById(student.getId());
	}

	public void deleteall() {
		repository.deleteAll();
	}

	public Student fetch(Student student) {
		return repository.findById(student.getId()).get();
	}

	public List<Student> fetchall() {
		return repository.findAll();
	}

	public String update(Student student) {
		Student data = repository.findById(student.getId()).get();

		if (student.getName() != null) {
			data.setName(student.getName());
		}

		if (student.getNumber() != 0) {
			data.setNumber(student.getNumber());
		}

		if (student.getYop() != null) {
			data.setYop(student.getYop());
		}

		repository.save(data);
		return "updated";
	}

	public String login(Student student) {
		String msge = "";
		try {
			Student databasevalues = repository.findById(student.getId()).get();

			if (databasevalues != null) {
				if (databasevalues.getId() == student.getId()
						&& databasevalues.getPassword().equals(student.getPassword())) {
					msge = "logged in";
				} else {
					msge = "incorret id and password";
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			msge = "account not found";
		}
		return msge;
	}

}
