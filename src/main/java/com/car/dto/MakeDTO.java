package com.car.dto;

public class MakeDTO {
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
}
