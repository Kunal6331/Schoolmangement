package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.Studentrepo;


@Service
public class StudentSrevice {

	Studentrepo repoitory;

	public void saveStudent(Student s) {

		repoitory.save(s);

	}

	public void deleteStudent(int sId) {
		repoitory.deleteById(sId);

	}

	public void deleteAll() {

		repoitory.deleteAll();

	}

	public Student getStudent(int sId) {

		return repoitory.findById(sId).get();

	}
	
	
	
	
	
	

}
