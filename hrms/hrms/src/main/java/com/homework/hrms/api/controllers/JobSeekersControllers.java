package com.homework.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.hrms.business.abstracts.JobSeekerService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersControllers {

	private JobSeekerService jobSeekerService;

	
	@Autowired
	public JobSeekersControllers(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getall() {
		return jobSeekerService.getall();
	}
	
	@PostMapping("/add")
	public Result add(JobSeeker jobSeeker) {
		return jobSeekerService.add(jobSeeker);
	}
	
}
