package com.nasir.econnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasir.econnect.entity.CategoryMaster;
import com.nasir.econnect.entity.Product;
import com.nasir.econnect.entity.ProductPropertyMaster;

public interface ProductPropertyMasterRepository extends JpaRepository<ProductPropertyMaster, Long> {

}
