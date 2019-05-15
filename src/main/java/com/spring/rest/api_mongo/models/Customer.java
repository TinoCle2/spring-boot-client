package com.spring.rest.api_mongo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	public ObjectId _id;
	
	public String name;
	public int dni;
	
	public Customer() {}

	public Customer(ObjectId _id, String name, int dni) {
		super();
		this._id = _id;
		this.name = name;
		this.dni = dni;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
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
