package com.jsp.SPRING_BOOT.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SPRING_BOOT.dao.Operations;
import com.jsp.SPRING_BOOT.dto.Student;

@RestController
public class Controls {
	@Autowired
	Operations operations;

	@PostMapping("/insert")
	public String insert(@RequestBody Student student) {
		operations.insert(student);
		return "inserted";
	}

	@DeleteMapping("/delete")
	public String delete(@RequestBody Student student) {
		operations.delete(student);
		return "deleted";
	}

	@DeleteMapping("/deleteall")
	public String deleteall() {
		operations.deleteall();
		return "all rows deleted";
	}

	@GetMapping("/fetch")
	public Student fetch(@RequestBody Student student) {
		Student fetch = operations.fetch(student);
		return fetch;
	}

	@GetMapping("/fetchall")
	public List<Student> ftechall() {
		List<Student> fetchall = operations.fetchall();
		return fetchall;
	}

	@PutMapping("/update")
	public String update(@RequestBody Student student) {
		String msge = operations.update(student);
		return msge;
	}

	@GetMapping("/login")
	public String login(@RequestBody Student student) {
		String msge = operations.login(student);
		return msge;
	}
}
