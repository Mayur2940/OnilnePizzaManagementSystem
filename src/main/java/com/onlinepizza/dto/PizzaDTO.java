package com.onlinepizza.dto;

import com.onlinepizza.util.PizzaSize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaDTO {

	private Integer pizzaId;
	private PizzaTypeDTO pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	private Double pizzaCost;
	private PizzaSize pizzaSize;
}
