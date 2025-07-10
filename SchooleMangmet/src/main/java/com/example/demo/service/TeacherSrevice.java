package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repo.Teacherrepo;

@Service
public class TeacherSrevice {

	@Autowired
	Teacherrepo repository;

	public void saveTeacher(Teacher t)
	
	{
		repository.save(t);
		
		
	}

	public Teacher getTeacher(int tId) {

		return repository.findById(tId).get();

	}

	public void deleteTeacher(int tId) {

		repository.deleteById(tId);
	}

	public void deleteAllTeacher() {

		repository.deleteAll();

	}

}
