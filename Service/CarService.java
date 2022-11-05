package com.example.Car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.Entity.Car;
import com.example.Car.Repository.CarRepository;
@Service
public class CarService {
	@Autowired
	CarRepository carRepo;
	
	//Add CarDteails to Database-->1

	public String addCarDetails(Car c) {
		
		 carRepo.save(c);
		 return "Added";
	}

	public List<Car> getCar() {
		
		return carRepo.getCarByEngine();
	}

}
