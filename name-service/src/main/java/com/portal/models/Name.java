package com.portal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @Data
public class Name {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	@Column(name = "street_address")
	private String address;
	
	/*
	 * @Column(name = "city_id") private int cityId;
	 */
	
	private int zip;
	
	@Column(name = "employee_role")
	private int role;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "city_id")
	private City city;
}
