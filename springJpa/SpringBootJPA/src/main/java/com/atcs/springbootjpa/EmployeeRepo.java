package com.atcs.springbootjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//it will convert the interface to repository
//save --which is used to save the data
//findAll--which is use to fetch all the data
//deleteBYid--which can delete the data

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEnitiy, Integer> {

}
