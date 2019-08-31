package br.com.deusdara.client;

import java.util.ArrayList;

import br.com.deusdara.model.Customer;
import feign.Headers;
import feign.RequestLine;

public interface CustomerClient {
	@RequestLine("GET")
    ArrayList<Customer> findAll();
 
    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(Customer customer);
}