package com.spring.rest.api_rest_client.models;


public class Customer {
	public String _id;
	
	public String name;
	public int dni;
	
	public Customer() {}

	public Customer(String _id, String name, int dni) {
		super();
		this._id = _id;
		this.name = name;
		this.dni = dni;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
}
