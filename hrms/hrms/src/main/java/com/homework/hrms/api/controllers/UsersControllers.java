package com.homework.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.homework.hrms.business.abstracts.UserService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.entities.concretes.Users;


@RestController
@RequestMapping("/api/users")
public class UsersControllers  {
		
	private UserService userService;
	
	@Autowired  //projeyi gezip o interfacei kim implemente edier onu bulur.ve o referansı ona atar.
	public UsersControllers(UserService userService) {
		super();
		this.userService = userService;
	}

	
	



	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){
		return this.userService.getall();	   //productManagerin getallu çağrılıyor.
	}
	
}
