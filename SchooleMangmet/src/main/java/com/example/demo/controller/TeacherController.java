package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherSrevice;

@RestController
public class TeacherController {

	@Autowired
	TeacherSrevice ts;

	@PostMapping("teacher")
	String addTeacher(@RequestBody Teacher t) {
		ts.saveTeacher(t);

		return "techar added";

	}

	@GetMapping("teacher/{tId}")
	Teacher getTeacher(@PathVariable int tId) {

		return ts.getTeacher(tId);

	}

	@DeleteMapping("teacher/{tId}")
	String deleteTeacher(@PathVariable int tId) {
		ts.deleteTeacher(tId);
		return "trcahr delded";

	}

	@DeleteMapping("teachers")
	String deleteAllTeachers() {

		ts.deleteAllTeacher();

		return "all teacher deldted";
	}

}
