package com.Moloko.simpleWebAppp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Moloko.simpleWebAppp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
