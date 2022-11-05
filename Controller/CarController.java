package com.example.Car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.Entity.Car;
import com.example.Car.Service.CarService;

@RestController
@RequestMapping(value="/car")


public class CarController {
	@Autowired
	CarService carSer;
	
	//Add CarDteails to Database-->1
	
	@PostMapping(value="/addcar")
	public String addCarDetails(@RequestBody Car c) {
		return carSer.addCarDetails(c);
	}
	@GetMapping(value="/getcarbyengine")
	public List<Car> getCar() {
		return carSer.getCar();
	}
	
	
	
	

}
