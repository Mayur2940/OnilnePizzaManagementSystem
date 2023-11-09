package com.onlinepizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.onlinepizza.entity.Pizza;
import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.entity.Toppings;
import com.onlinepizza.serviceimp.IPizzaServiceImp;

public class IPizzaServiceController {
	
	@Autowired 
	private IPizzaServiceImp iPizzaServiceImp;
	
	
	@PostMapping("/addpizza")
	public Pizza addPizza(@RequestBody Pizza pizza) {
		return iPizzaServiceImp.addPizza(pizza);
	}
	
	
	
	@PostMapping("/addtoppings")
	public Toppings addToppings( @RequestBody  Toppings toppings) {
		return iPizzaServiceImp.addToppings(toppings);  
	}
	
	@PostMapping("/addpizzatype")
	public PizzaType addPizzaType(@RequestBody PizzaType pizzaType) {
		return iPizzaServiceImp.addPizzaType(pizzaType);
		
	}
	@PostMapping("/updatepizza")
	public Pizza updatePizza(@RequestBody Pizza pizza) {
		return iPizzaServiceImp.updatePizza(pizza);
		
	}
	
	@GetMapping("/viewpizzabyid/{pizzaid}")
	public Pizza viewPizzaById(@PathVariable("pizzaid") Integer pizzaId) {
		return iPizzaServiceImp.viewPizzaById(pizzaId);
		
	}
	
	@GetMapping("/viewbyptype/{pizzatype}")
	public List<Pizza> viewPizzaByPizzaType(@PathVariable("pizzatype") String pizzaType){
		return iPizzaServiceImp.viewPizzaByPizzaType(pizzaType);
		
	}
	
	@GetMapping("/viewbypsize/{pizzasize}")
	public List<Pizza> viewPizzaByPizzaSize(@PathVariable ("pizzasize") String pizzaSize){
		return iPizzaServiceImp.viewPizzaByPizzaSize(pizzaSize);
		
	}
	
	@GetMapping("/viewbypprice/{minprice}/{maxprice}")
	public List<Pizza> viewPizzaByPrice(@PathVariable("minprice") Double minPrice,@PathVariable ("maxprice") Double maxPrice ){
		
		return iPizzaServiceImp.viewPizzaByPrice(minPrice, maxPrice);
		
	}
	
	@GetMapping("/viewallpizza")
	public List<Pizza> viewAllPizza(){
		return iPizzaServiceImp.viewAllPizza();
		
	}
	
	@GetMapping("/viewtoppings")
	public List<Toppings> viewToppings(){
		return iPizzaServiceImp.viewToppings();
		
	}
	
	
	@GetMapping("/viewtbyid")
	public Toppings viewToppingByID(Integer toppingsID) {
		return iPizzaServiceImp.viewToppingByID(toppingsID);
		
	}
	
	@GetMapping("/viewpbyid")
	public PizzaType viewPizzaTypeById(Integer pizzaTypeId) {
		return iPizzaServiceImp.viewPizzaTypeById(pizzaTypeId);
		
	}
	
	@GetMapping("/viewallpbytype")
	public List<PizzaType> viewAllPizzaTypes(){
		return iPizzaServiceImp.viewAllPizzaTypes();
		
	}
	
}

