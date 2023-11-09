package com.onlinepizza.serviceimp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinepizza.entity.Pizza;
import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.entity.Toppings;
import com.onlinepizza.repository.PizzaRepository;
import com.onlinepizza.repository.PizzaTypeRepository;
import com.onlinepizza.repository.ToppingsRepository;
import com.onlinepizza.service.IPizzaService;

public class IPizzaServiceImp implements IPizzaService {

	@Autowired
	PizzaRepository pizzaRepository;

	@Autowired
	ToppingsRepository toppingsRepository;

	@Autowired
	PizzaTypeRepository pizzaTypeRepository;
	
	@Override
	public Pizza addPizza(Pizza pizza) {
		pizzaRepository.save(pizza);
		return pizza;
	}

	@Override
	public Toppings addToppings(Toppings toppings) {
		Toppings newToppings = new Toppings();
		newToppings.setToppingsName(toppings.getToppingsName());
		newToppings.setPrice(toppings.getPrice());
		toppingsRepository.save(newToppings);
		return newToppings;

	}

	@Override
	public PizzaType addPizzaType(PizzaType pizzaType) {
		
		PizzaType newPizzaType = new PizzaType();

		newPizzaType.setPizzaType(pizzaType.getPizzaType());
		newPizzaType.setToppings(pizzaType.getToppings());

		pizzaTypeRepository.save(newPizzaType);

		return newPizzaType;
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
		
		Pizza updatePizza = new Pizza();
		updatePizza.setPizzaCost(pizza.getPizzaCost());
		updatePizza.setPizzaDescription(pizza.getPizzaDescription());
		updatePizza.setPizzaId(pizza.getPizzaId());
		updatePizza.setPizzaSize(pizza.getPizzaSize());
		updatePizza.setPizzaName(pizza.getPizzaName());
		updatePizza.setPizzaType(pizza.getPizzaType());

		return updatePizza;
	}

	@Override
	public Pizza viewPizzaById(Integer pizzaId) {
		
		return pizzaRepository.findById(pizzaId).get();
	}

	@Override
	public List<Pizza> viewPizzaByPizzaType(String pizzaType) {
		return pizzaRepository.findAll().stream().filter(e -> e.getPizzaType().getPizzaType().equals(pizzaType))
				.collect(Collectors.toList());
	}

	@Override
	public List<Pizza> viewPizzaByPizzaSize(String pizzaSize) {
		return pizzaRepository.findAll().stream().filter(e -> e.getPizzaSize().toString().equals(pizzaSize))
				.collect(Collectors.toList());
	}

	@Override
	public List<Pizza> viewPizzaByPrice(Double minPrice, Double maxPrice) {
		return pizzaRepository.findAll().stream()
				.filter(e -> e.getPizzaCost() >= minPrice || e.getPizzaCost() <= maxPrice).collect(Collectors.toList());
	}

	@Override
	public List<Pizza> viewAllPizza() {
		return pizzaRepository.findAll();
	}

	@Override
	public List<Toppings> viewToppings() {
		return toppingsRepository.findAll();
	}

	@Override
	public Toppings viewToppingByID(Integer toppingsID) {
		return toppingsRepository.findById(toppingsID).get();
	}

	@Override
	public PizzaType viewPizzaTypeById(Integer pizzaTypeId) {
		return pizzaTypeRepository.findById(pizzaTypeId).get();
	}

	@Override
	public List<PizzaType> viewAllPizzaTypes() {
		return pizzaTypeRepository.findAll();
	}

}
