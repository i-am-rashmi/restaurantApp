package com.thoughtclan.restaurant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtclan.restaurant.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	Optional<Customer> findByEmail(String email);
	

}
