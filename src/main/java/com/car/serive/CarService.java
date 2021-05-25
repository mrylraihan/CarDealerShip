package com.car.serive;

import java.util.List;

import com.car.dto.MakeDTO;
import com.car.dto.ModelDTO;
import com.car.exception.CarException;


public interface CarService {
	public List<ModelDTO> getAllCars() throws CarException;
	public List<MakeDTO> getAllMakers() throws CarException;
}
