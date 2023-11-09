package com.onlinepizza.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PizzaType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pizzaTypeId;
	// Veg or Non-Veg
	private String pizzaType;
	@OneToMany
	private List<Toppings> toppings;

}
