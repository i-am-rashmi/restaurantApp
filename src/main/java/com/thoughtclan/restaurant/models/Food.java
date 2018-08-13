package com.thoughtclan.restaurant.models;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.NaturalId;



@Entity
@Table(name = "food")
public class Food
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFood;
	
	@NotBlank
	@Size(max=45)
	@Column(name="name")
	private String foodName;
	
	@Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 30)
    private FoodType type;
	
	@NotBlank
	private Double price;
	


	public Long getFoodId() {
		return idFood;
	}

	public void setFoodId(Long foodId) {
		this.idFood = foodId;
	}

	public String getfoodName() {
		return foodName;
	}

	public void setfoodName(String foodName) {
		this.foodName = foodName;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	
	

}
