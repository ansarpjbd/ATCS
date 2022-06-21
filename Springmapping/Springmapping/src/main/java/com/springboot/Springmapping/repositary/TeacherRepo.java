package com.springboot.Springmapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Springmapping.entity.Address;
import com.springboot.Springmapping.entity.Student;
import com.springboot.Springmapping.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
