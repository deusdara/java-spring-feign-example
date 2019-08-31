package br.com.deusdara.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.deusdara.client.CustomerClient;
import br.com.deusdara.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerClient customerClient;
	
	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		customerClient.create(customer);
	}

	@GetMapping
	public ResponseEntity<ArrayList<Customer>> getAllCustomers() {
		return ResponseEntity.ok(customerClient.findAll());
	}
}