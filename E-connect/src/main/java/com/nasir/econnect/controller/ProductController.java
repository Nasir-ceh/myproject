package com.nasir.econnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasir.econnect.entity.Product;
import com.nasir.econnect.entity.ProductDetails;
import com.nasir.econnect.repository.ProductDetailsRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductDetailsRepository repo;
	@GetMapping()
	public ResponseEntity<?> getAllProduct(){
		Product product = new Product();
		product.setId(1l);
		List<ProductDetails> findAllByProduct = repo.findAllByProduct(product);
		return new ResponseEntity<List<ProductDetails>>(findAllByProduct, HttpStatus.OK);
	}
	
}
