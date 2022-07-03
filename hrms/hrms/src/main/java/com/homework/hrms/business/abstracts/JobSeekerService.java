package com.homework.hrms.business.abstracts;

import java.util.List;

import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getall();
	Result add(JobSeeker jobSeeker);
}
