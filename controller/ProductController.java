package com.Moloko.simpleWebAppp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Moloko.simpleWebAppp.model.Product;
import com.Moloko.simpleWebAppp.service.ProductService;
@RestController
public class ProductController 
{
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts() //Getting all products
	{
		return service.getProducts();
	}
	@GetMapping("/products/{prodId}") //Getting Specific Product
	public Product getProductById(@PathVariable int prodId)
	{
		return service.getProductById(prodId);
	}
	@PostMapping("/products") //Posting JSON data 
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		service.addProduct(prod);
	}
}
