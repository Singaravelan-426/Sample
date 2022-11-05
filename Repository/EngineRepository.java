package com.example.Car.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Car.Entity.Engine;

public interface EngineRepository extends JpaRepository<Engine, Integer> {

}
