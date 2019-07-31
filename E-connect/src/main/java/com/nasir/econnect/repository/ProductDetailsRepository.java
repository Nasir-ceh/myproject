package com.nasir.econnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasir.econnect.entity.CategoryMaster;
import com.nasir.econnect.entity.Product;
import com.nasir.econnect.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {

	List<ProductDetails> findAllByProduct(Product product);
}
