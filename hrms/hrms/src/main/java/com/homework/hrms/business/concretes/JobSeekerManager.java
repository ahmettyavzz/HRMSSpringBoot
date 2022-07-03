package com.homework.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.hrms.business.abstracts.JobSeekerService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.core.utilities.results.SuccessDataResult;
import com.homework.hrms.core.utilities.results.SuccessResult;
import com.homework.hrms.dataAccess.abstracts.JobSeekerDao;
import com.homework.hrms.entities.concretes.JobSeeker;

import javassist.expr.NewArray;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	
	
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	
	@Override
	public DataResult<List<JobSeeker>> getall() {
		return new SuccessDataResult<List<JobSeeker>>(jobSeekerDao.findAll(), "JobSeekers Listelendi.");
	}


	@Override
	public Result add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Job seeker kaydedildi.");
	}

}
