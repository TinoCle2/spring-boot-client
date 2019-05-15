package com.spring.rest.api_mongo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.rest.api_mongo.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	Customer findBy_id(ObjectId _id);
}
