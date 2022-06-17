package com.atcs.springbootjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.springbootjpa.entity.Dept;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Integer> {

}
