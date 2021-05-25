package com.car.dto;

import com.car.entity.MakeEntity;

public class ModelDTO {
	private Integer modelId;
	private String modelName;
	private Integer modelYear;
	private Double modelPrice;
	private MakeEntity make;
	
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Integer getModelYear() {
		return modelYear;
	}
	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}
	public Double getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(Double modelPrice) {
		this.modelPrice = modelPrice;
	}
	public MakeEntity getMake() {
		return make;
	}
	public void setMake(MakeEntity make) {
		this.make = make;
	}
	
}
