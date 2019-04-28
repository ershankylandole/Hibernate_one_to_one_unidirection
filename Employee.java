package com.clc.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//OnetoOne Mapping uni

@Entity
@Table(name= "one_to_one_emp")
public class Employee {

	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

@Entity
@Table(name= "one_to_one_address")
class Address
{	
	@Id
	private int addrid;
	private String city;
	
	
	public Address(int addrid, String city) {
		super();
		this.addrid = addrid;
		this.city = city;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {}
	
	
	 
}
