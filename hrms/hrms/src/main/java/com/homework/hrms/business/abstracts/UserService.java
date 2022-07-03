
package com.homework.hrms.business.abstracts;

import java.util.List;

import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.entities.concretes.Users;

public interface UserService {
//	List<Users> getAll();
	DataResult<List<Users>> getall();

	
}
