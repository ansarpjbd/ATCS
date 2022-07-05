package com.atcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
