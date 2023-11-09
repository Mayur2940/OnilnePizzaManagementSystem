package com.onlinepizza.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.onlinepizza.util.PizzaStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PizzaOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookingOrderId;
	private LocalDateTime dateTimeOfOrder;
	private Integer quantity;
	private Double totalCost;
	
	@OneToMany
	private List<Pizza> pizzaList;
	@OneToOne
	private Customer customer;
	private PizzaStatus status;
}
