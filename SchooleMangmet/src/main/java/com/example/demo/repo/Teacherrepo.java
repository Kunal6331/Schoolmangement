package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Teacher;

public interface Teacherrepo extends JpaRepository<Teacher, Integer>  {

}
