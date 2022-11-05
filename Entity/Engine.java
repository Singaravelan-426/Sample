package com.example.Car.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="engine")

public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String engineBrand;
	private String engineModel;
	private int engineNoOfPiston;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "engine")
	List<Car> cars=new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngineBrand() {
		return engineBrand;
	}

	public void setEngineBrand(String engineBrand) {
		this.engineBrand = engineBrand;
	}

	public String getEngineModel() {
		return engineModel;
	}

	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}

	public int getEngineNoOfPiston() {
		return engineNoOfPiston;
	}

	public void setEngineNoOfPiston(int engineNoOfPiston) {
		this.engineNoOfPiston = engineNoOfPiston;
	}
	
	

	

}
