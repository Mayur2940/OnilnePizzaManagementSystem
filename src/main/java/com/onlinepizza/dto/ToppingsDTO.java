package com.onlinepizza.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToppingsDTO {

	private Integer toppingsId;
	private String toppingsName;
	private Double price;

}
