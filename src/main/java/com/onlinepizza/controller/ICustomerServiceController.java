package com.onlinepizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.entity.Customer;
import com.onlinepizza.serviceimp.ICustomerServiceImp;

@RestController
@RequestMapping("/customerservice")
public class ICustomerServiceController {

	@Autowired
	ICustomerServiceImp iCustomerServiceImp;
	
	@PostMapping("/regcustomer")
	public Customer registerCustomer(@RequestBody Customer customer)
	{
		return iCustomerServiceImp.registerCustomer(customer);
	}
	
	@PostMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return iCustomerServiceImp.updateCustomer(customer);
	}
	
	@PutMapping ("/viewcbyphone/{phoneNo}")
	public Customer viewCustomerByPhone(@PathVariable ("phoneNo") Long phoneNo) {
		return iCustomerServiceImp.viewCustomerByPhone(phoneNo);
	}
	
	@GetMapping("/viewallcustomer")
	public List<Customer> viewAllCustomer(){
		return iCustomerServiceImp.viewAllCustomer();
	}
	
	@GetMapping("/viewcbyid/{customerId}")
	public Customer viewCustomerById(@PathVariable (" customerId") Integer customerId) {
		return iCustomerServiceImp.viewCustomerById(customerId);
		
	}
}
