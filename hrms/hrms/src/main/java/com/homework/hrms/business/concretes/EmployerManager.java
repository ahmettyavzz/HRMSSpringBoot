package com.homework.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.hrms.business.abstracts.EmployerService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.core.utilities.results.SuccessDataResult;
import com.homework.hrms.core.utilities.results.SuccessResult;
import com.homework.hrms.dataAccess.abstracts.EmployerDao;
import com.homework.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getall() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(), "Employers listelendi");
	}

	@Override
	public Result add(Employer employer) {	
		employerDao.save(employer);
		return new SuccessResult("Employer eklendi.");
	}
	
	
	
	
	
	

}
