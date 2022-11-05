package com.example.Car.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.Entity.Engine;
import com.example.Car.Service.EngineService;

@RestController
@RequestMapping(value="/engine")
public class EngineController {
	@Autowired
	
	EngineService engSer;
	
//Add Engine Data to DataBase
	
	@PostMapping(value="addengine")
	public String addEngineDetails(@RequestBody Engine e) {
		return engSer.addEngineDetails(e);
	}
	
}
