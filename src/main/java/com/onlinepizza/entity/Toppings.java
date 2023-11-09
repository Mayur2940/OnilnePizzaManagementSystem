package com.onlinepizza.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Toppings {

	private Integer toppingsId;
	private String toppingsName;
	private Double price;
}
