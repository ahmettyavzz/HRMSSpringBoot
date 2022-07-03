package com.homework.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer>{

}
