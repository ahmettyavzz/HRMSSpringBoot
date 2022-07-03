package com.homework.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.hrms.entities.concretes.Users;


public interface UserDao extends JpaRepository<Users, Integer>{

}
