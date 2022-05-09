package com.tanmay.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	private final RequestRepository repository;

	public RequestController(RequestRepository repository) {
		super();
		this.repository = repository;
	}
	@PostMapping("/Requests")
	 Request newRequest(@RequestBody Request newRequest) {
	    return repository.save(newRequest);
	  }
	
	@DeleteMapping("/Requests/{id}")
	  void deleteEmployee(@PathVariable int id) {
	    repository.deleteById(id);
	  }
	@GetMapping("/Requests/{id}")
	List<Request> getRequestsByCustomer(@PathVariable int id){
		return repository.findByCustomerId(id);
	}
}
