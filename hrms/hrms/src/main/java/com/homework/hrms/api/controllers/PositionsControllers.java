package com.homework.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.hrms.business.abstracts.SystemPersonalService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.entities.concretes.Position;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/api/positions")
public class PositionsControllers {

	private SystemPersonalService positionService;

	@Autowired
	public PositionsControllers(SystemPersonalService positionService) {
		super();
		this.positionService = positionService;
	}
	
	

	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getall();	   //productManagerin getallu çağrılıyor.
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Position position){
		return this.positionService.add(position);	   //productManagerin getallu çağrılıyor.
	}
	
	
}
