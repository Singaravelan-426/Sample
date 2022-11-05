package com.example.Car.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.Entity.Engine;
import com.example.Car.Repository.EngineRepository;

@Service
public class EngineService {
	@Autowired
	
	EngineRepository engRepo;

	public String addEngineDetails(Engine e) {
		engRepo.save(e);
		return "Saved";
	}

}
