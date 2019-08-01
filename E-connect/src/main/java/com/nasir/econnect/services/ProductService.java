package com.nasir.econnect.services;

import java.util.List;

import com.nasir.econnect.entity.Product;
import com.nasir.econnect.entity.ProductDetails;
import com.nasir.econnect.entity.ProductPropertyMaster;

public interface ProductService {
	
	ProductPropertyMaster saveProperty(ProductPropertyMaster prodcutPropety);
	ProductPropertyMaster updateProperty(ProductPropertyMaster prodcutPropety);
	ProductPropertyMaster deleteProperty(ProductPropertyMaster prodcutPropety);
	ProductPropertyMaster findProperty(ProductPropertyMaster prodcutPropety);
	ProductPropertyMaster findPropertyById(Long id);
	List<ProductPropertyMaster> findAllPropety();
	
	Product saveProduct(Product prodcut);
	Product updateProduct(Product prodcut);
	Product deleteProduct(Product prodcut);
	Product findProduct(Product prodcut);
	Product findProductById(Long id);
	List<Product> findAllProduct();
	
	ProductDetails saveProductDetails(ProductDetails prodcutDetails);
	ProductDetails updateProductDetails(ProductDetails prodcutDetails);
	ProductDetails deleteProductDetails(ProductDetails prodcutDetails);
	ProductDetails findProductDetails(ProductDetails prodcutDetails);
	ProductDetails findProductDetailsById(Long id);
	List<ProductDetails> findAllProductDetails();
	
	
	
}
