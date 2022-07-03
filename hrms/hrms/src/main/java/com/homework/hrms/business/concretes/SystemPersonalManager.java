package com.homework.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.hrms.business.abstracts.SystemPersonalService;
import com.homework.hrms.core.utilities.results.DataResult;
import com.homework.hrms.core.utilities.results.Result;
import com.homework.hrms.core.utilities.results.SuccessDataResult;
import com.homework.hrms.core.utilities.results.SuccessResult;
import com.homework.hrms.dataAccess.abstracts.PositionDao;
import com.homework.hrms.entities.concretes.Position;


@Service
public class SystemPersonalManager implements SystemPersonalService{

	private PositionDao positionDao;
	
	
	
	@Autowired
	public SystemPersonalManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getall() {
		return new SuccessDataResult<List<Position>>(positionDao.findAll(), "Positions listelendi");
	}

	@Override
	public Result add(Position position) {
		positionDao.save(position);
		return new SuccessResult("Data eklendi.");
	}

	
	
}
