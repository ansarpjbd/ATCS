package com.springboot.Springmapping.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class ComapnyEntity {
	
	
	public List<JobEntity> getJobs() {
		return jobs;
	}

	public void setJobs(List<JobEntity> jobs) {
		this.jobs = jobs;
	}

	List<JobEntity> jobs;

}
