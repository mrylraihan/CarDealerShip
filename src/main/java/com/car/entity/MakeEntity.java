package com.car.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.car.dto.MakeDTO;

@Entity
@Table(name ="make")
public class MakeEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer make_id;
	private String makeName;
	private String countryOrigin;
	
	public Integer getMake_id() {
		return make_id;
	}
	public void setMake_id(Integer make_id) {
		this.make_id = make_id;
	}
	public String getMakeName() {
		return makeName;
	}
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public MakeDTO prepareDTO() {
		MakeDTO dto = new MakeDTO();
		dto.setCountryOrigin(this.countryOrigin);
		dto.setMake_id(this.make_id);
		dto.setMakeName(this.makeName);
		return dto;
		
	}
	
}
