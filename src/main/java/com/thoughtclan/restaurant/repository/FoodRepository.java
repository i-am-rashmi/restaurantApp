package com.thoughtclan.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtclan.restaurant.models.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>
{

}
