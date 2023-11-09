package com.onlinepizza.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO extends UserDTO{

	private String customerName;
	private Long customerMobile;
	private String customerEmail;
	private String customerAddress;
}
