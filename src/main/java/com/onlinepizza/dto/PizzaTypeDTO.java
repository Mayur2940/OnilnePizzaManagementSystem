package com.onlinepizza.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaTypeDTO {

	private Integer pizzaTypeId;
	// Veg or Non-Veg
	private String pizzaType;
	private List<ToppingsDTO> toppings;

}
