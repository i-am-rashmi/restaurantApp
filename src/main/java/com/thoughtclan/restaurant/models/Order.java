package com.thoughtclan.restaurant.models;

import javax.persistence.*;

@Entity
@Table(name="order")
public class Order 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idOrder;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCustomer")
	public Customer customer;
	

	public Integer getIdorder() {
		return idOrder;
	}

	public void setIdorder(Integer idorder) {
		this.idOrder = idorder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



}
