package com.spring.rest.api_rest_client.controller;

import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.rest.api_rest_client.models.Customer;

@RestController
@RequestMapping("/clientes")
public class CustomerController {
	@Autowired
	RestTemplate restTemplate;
	@Value("${MONGO_API_ENDPOINT:http://localhost:8080}")
	String endpoint;
		
	Log log = LogFactory.getLog(CustomerController.class);

	@RequestMapping(value = "/")
	public String getCustomerList() {
	   HttpHeaders headers = new HttpHeaders();
	   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	   HttpEntity <String> entity = new HttpEntity<String>(headers);
	   
	   log.info("GET "+ endpoint + "/customers/");
	   return restTemplate.exchange(
			   endpoint+"/customers/", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String createCustomer(@RequestBody Customer customer) {
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Customer> entity = new HttpEntity<Customer>(customer,headers);
	      log.info("POST "+ endpoint + "/customers/");
	      
	      return restTemplate.exchange(
	    		  endpoint+"/customers/", HttpMethod.POST, entity, String.class).getBody();
	}
}