package com.example.Car.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Car.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	@Query(value = "SELECT *  From cardetails.car INNER JOIN cardetails.engine ON cardetails.car.id=cardetails.engine.id",nativeQuery = true)
public List<Car> getCarByEngine();
}
