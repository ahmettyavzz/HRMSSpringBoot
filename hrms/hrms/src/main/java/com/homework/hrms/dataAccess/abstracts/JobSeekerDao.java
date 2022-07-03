package com.homework.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{

}
