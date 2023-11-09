package com.onlinepizza.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.onlinepizza.util.PizzaStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaOrderDTO {

	private Integer bookingOrderId;
	private LocalDateTime dateTimeOfOrder;
	private Integer quantity;
	private Double totalCost;
	private List<PizzaDTO> pizzaList;
	private CustomerDTO customer;
	private PizzaStatus status;
}
