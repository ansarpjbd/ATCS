package com.springboot.Springmapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Springmapping.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
