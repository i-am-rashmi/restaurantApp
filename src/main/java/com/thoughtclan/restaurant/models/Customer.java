package com.thoughtclan.restaurant.models;



import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="customer")

public class Customer
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCustomer;
	
	@NotBlank
	@Size(max =  45)
	@Column(name = "name")
	private String username;
	

	@NotBlank
	@Size(max=45)
	@Email
	private String email;
	

	@NotBlank
    @Size(max = 45)
    private String password;
	


	public Integer getIdcustomer() {
		return idCustomer;
	}

	public void setIdcustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
