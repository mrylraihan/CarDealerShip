package com.car.serive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dto.MakeDTO;
import com.car.dto.ModelDTO;
import com.car.exception.CarException;
import com.car.repository.MakeRepository;
import com.car.repository.ModelRepository;
@Service(value = "carService")
public class CarServiceImpl implements CarService{
	@Autowired
	private MakeRepository makeRepository;
	@Autowired
	private ModelRepository modelRepository;
	
	@Override
	public List<ModelDTO> getAllCars() throws CarException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MakeDTO> getAllMakers() throws CarException {
		// TODO Auto-generated method stub
		return null;
	}

}
