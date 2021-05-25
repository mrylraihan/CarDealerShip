package com.car.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.car.dto.ModelDTO;

@Entity
@Table (name = "model")
public class ModelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer modelId;
	private String modelName;
	private Integer modelYear;
	private Double modelPrice;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "make")
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
	public ModelDTO prepareDTO() {
		ModelDTO dto = new ModelDTO();
		dto.setMake(this.make);
		dto.setModelId(this.modelId);
		dto.setModelName(this.modelName);
		dto.setModelPrice(this.modelPrice);
		dto.setModelYear(this.modelYear);
		return dto;
		
	}
	
	
}
