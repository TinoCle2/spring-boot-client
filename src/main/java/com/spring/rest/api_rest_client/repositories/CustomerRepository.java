package com.spring.rest.api_rest_client.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.rest.api_rest_client.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	Customer findBy_id(ObjectId _id);
}
