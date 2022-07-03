package com.homework.hrms.business.abstracts;

import java.util.List;

import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.entities.concretes.Position;


public interface SystemPersonalService {

	// List<Positions> getall();
	DataResult<List<Position>> getall(); 
	
	Result add(Position position); 
	
	
}
