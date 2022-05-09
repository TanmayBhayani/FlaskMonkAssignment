package com.tanmay.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private final ProductRepository repository;

	public ProductController(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/Products")
	List<Product> getAll()
	{
		return repository.findAll();
	}
	
	@PostMapping("/Products")
	Product addProduct(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@PutMapping("/Products/{id}")
	Product updateProduct(@RequestBody Product newProduct, @PathVariable int id) throws ProductNotFoundException
	{
		return repository.findById(id)
				.map((product) ->{
					product.setQty(newProduct.getQty());
					return repository.save(product);
				}).orElseGet(() -> {
					newProduct.setId(id);
			        return repository.save(newProduct);
				});
	}
}
