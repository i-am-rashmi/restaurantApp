package com.thoughtclan.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtclan.restaurant.models.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>
{

}
