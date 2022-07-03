package com.homework.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.homework.hrms.business.abstracts.UserService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.SuccessDataResult;
import com.homework.hrms.dataAccess.abstracts.UserDao;
import com.homework.hrms.entities.concretes.Users;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	


	@Override
	public DataResult<List<Users>> getall() {

		return new SuccessDataResult<List<Users>>(userDao.findAll(), "Users listelendi.");
	}

}
