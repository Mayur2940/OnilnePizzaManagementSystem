package com.onlinepizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Toppings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer toppingsId;
	private String toppingsName;
	private Double price;
	
	@ManyToOne
	private Pizza pizza;
}
