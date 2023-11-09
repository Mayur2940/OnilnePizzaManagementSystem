package com.onlinepizza.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.repository.PizzaTypeRepository;
import com.onlinepizza.service.IPizzaTypeService;

public class IPizzaTypeServiceImp implements IPizzaTypeService {

	@Autowired
	PizzaTypeRepository pizzaTypeRepository;

	
	public String addPizzaType(PizzaType pizzaType) {
		pizzaTypeRepository.save(pizzaType);
		return "Added PizzaType successfully";

	}

	
	public String deleteById(Integer pizzaTypeId) {
		pizzaTypeRepository.deleteById(pizzaTypeId);
		return "PizzaType Removed";
	}

	
	public List<PizzaType> viewPizzaType() {
		return 	pizzaTypeRepository.findAll();
	}

}
