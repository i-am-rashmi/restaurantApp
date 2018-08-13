package com.thoughtclan.restaurant.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtclan.restaurant.models.Customer;
import com.thoughtclan.restaurant.repository.CustomerRepository;

import com.thoughtclan.restaurant.exceptions.ResourceNotFoundException;

@RestController
public class CustomerController 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	//Get all customers
	@GetMapping("/customer")
	public List<Customer> getCustomers()
	{
		return customerRepository.findAll();
	}
	
	//add customer 
	@PostMapping("/customer")
	public Customer createCustomer(@Valid @RequestBody Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	
	//get customer by id
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable(value = "customer_id")int id)
	{
		return customerRepository.findById(id);
	}
		
	
	//get customer by email
	@GetMapping("/customer/{email}")
	public Optional<Customer>getCustomerByEmail(@PathVariable(value="email")String email)
	{
		return customerRepository.findByEmail(email);
	}
	
	//update existing customers by id
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(@PathVariable(value="customer_id")int id, @Valid @RequestBody Customer customer)
	{
		 Customer customerNew = customerRepository.findById(id)
		            .orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customer));
		 customerNew.setUsername(customer.getUsername());
		 customerNew.setEmail(customer.getEmail());
		 customerNew.setPassword(customer.getPassword());
		 return customerNew;
		
	}
	//update existing customer by email
	
	
	
	

}
