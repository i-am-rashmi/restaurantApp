package com.thoughtclan.restaurant.models;


import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdOn"}, allowGetters = true)
public class OrderDetails 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Integer idOrderDetails;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idOrder")
	private Order order;
	
	@OneToMany
	@JoinColumn(name="idFood")
	private Food food;
	
	
	
	public Integer getIdorderDetails() {
		return idOrderDetails;
	}


	public void setIdorderDetails(Integer idorderDetails) {
		this.idOrderDetails = idorderDetails;
	}

//
//	@Temporal(TemporalType.DATE)
//	@Column(name= "created_on",nullable = false,updatable = false)
//	@CreatedDate
//	private Date createdOn;
//	
	
	@NotBlank
	private Long quantity;


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


//	public Date getCreatedOn() {
//		return createdOn;
//	}
//
//
//	public void setCreatedOn(Date createdOn) {
//		this.createdOn = createdOn;
//	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	



}
