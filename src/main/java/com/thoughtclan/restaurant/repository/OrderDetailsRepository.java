package com.thoughtclan.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtclan.restaurant.models.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>
{

}
