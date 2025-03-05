package com.Moloko.simpleWebAppp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.Moloko.simpleWebAppp.model.Product;

@Service
public class ProductService 
{
	List<Product> products = Arrays.asList(
			new Product(101,"Iphone", 50000),
			new Product(102,"Canon Camera",70000),
			new Product(103,"Shure Mic",10000));
	
	public List<Product> getProducts()
	{
		return products;
	}
}
