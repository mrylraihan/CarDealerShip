package com.car.repository;

import org.springframework.data.repository.CrudRepository;

import com.car.entity.ModelEntity;

public interface ModelRepository extends CrudRepository<ModelEntity, Integer>{

}
