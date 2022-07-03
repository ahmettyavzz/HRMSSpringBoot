package com.homework.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
