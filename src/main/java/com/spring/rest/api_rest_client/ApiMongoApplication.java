package com.spring.rest.api_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMongoApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
	   return new RestTemplate();
	}

}
