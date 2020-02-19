package com.nikhil.microserviceforexservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.microserviceforexservice.models.ExchangeValue;
import com.nikhil.microserviceforexservice.repositories.ExchangeValueRepository;

@RestController
public class ForexController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(
		@PathVariable String from,
		@PathVariable String to) {
	ExchangeValue exchangeValue = repository.findByFromAndTo(from, to)
			.orElseThrow(() -> new RuntimeException("Error: not found!"));
	exchangeValue.setPort(
			Integer.parseInt(environment.getProperty("local.server.port")));
	return exchangeValue;
		
	}
	
	
	
	
}
