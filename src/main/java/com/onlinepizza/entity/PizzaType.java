package com.onlinepizza.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PizzaType {

	private Integer pizzaTypeId;
	// Veg or Non-Veg
	private String pizzaType;
	@ManyToOne
	private List<Toppings> toppings;

}
