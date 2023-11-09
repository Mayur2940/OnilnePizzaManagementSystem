package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinepizza.entity.PizzaType;

public interface PizzaTypeRepository extends JpaRepository<PizzaType, Integer>{

//	PizzaType findByPizzaTypeId(int id); // check once
}
