package com.nasir.econnect.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasir.econnect.entity.Product;
import com.nasir.econnect.entity.ProductDetails;
import com.nasir.econnect.entity.ProductPropertyMaster;
import com.nasir.econnect.repository.ProductDetailsRepository;
import com.nasir.econnect.repository.ProductPropertyMasterRepository;
import com.nasir.econnect.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private ProductDetailsRepository productDetailsRepo;
	@Autowired
	private ProductPropertyMasterRepository productMasterRepo;

	@Override
	public ProductPropertyMaster saveProperty(ProductPropertyMaster prodcutPropety) {

		return productMasterRepo.save(prodcutPropety);

	}

	@Override
	public ProductPropertyMaster updateProperty(ProductPropertyMaster prodcutPropety) {

		boolean present = productMasterRepo.findById(prodcutPropety.getId()).isPresent();
		if (present) {
			return productMasterRepo.save(prodcutPropety);
		}
		return null;
	}

	@Override
	public ProductPropertyMaster deleteProperty(ProductPropertyMaster prodcutPropety) {
		boolean present = productMasterRepo.findById(prodcutPropety.getId()).isPresent();
		if (present) {
			productMasterRepo.delete(prodcutPropety);
			return prodcutPropety;
		}
		return null;
	}

	@Override
	public ProductPropertyMaster findProperty(ProductPropertyMaster prodcutPropety) {
		return productMasterRepo.findById(prodcutPropety.getId()).get();
	}

	@Override
	public ProductPropertyMaster findPropertyById(Long id) {
		return productMasterRepo.findById(id).get();
	}

	@Override
	public List<ProductPropertyMaster> findAllPropety() {
		return productMasterRepo.findAll();
	}

	@Override
	public Product saveProduct(Product prodcut) {
		return productRepo.save(prodcut);
	}

	@Override
	public Product updateProduct(Product prodcut) {
		boolean present = productRepo.findById(prodcut.getId()).isPresent();
		if (present) {
			return productRepo.save(prodcut);
		}
		return null;
	}

	@Override
	public Product deleteProduct(Product prodcut) {
		boolean present = productRepo.findById(prodcut.getId()).isPresent();
		if (present) {
			productRepo.delete(prodcut);
			return prodcut;
		}
		return null;
	}

	@Override
	public Product findProduct(Product prodcut) {
		return productRepo.findById(prodcut.getId()).get();

	}

	@Override
	public Product findProductById(Long id) {
		return productRepo.findById(id).get();
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public ProductDetails saveProductDetails(ProductDetails prodcutDetails) {
		return productDetailsRepo.save(prodcutDetails);
	}

	@Override
	public ProductDetails updateProductDetails(ProductDetails prodcutDetails) {
		boolean present = productDetailsRepo.findById(prodcutDetails.getId()).isPresent();
		if (present) {
			return productDetailsRepo.save(prodcutDetails);
		}
		return null;
	}

	@Override
	public ProductDetails deleteProductDetails(ProductDetails prodcutDetails) {
		Optional<ProductDetails> findById = productDetailsRepo.findById(prodcutDetails.getId());
		boolean present = findById.isPresent();
		if (present) {
			productDetailsRepo.delete(prodcutDetails);
			return prodcutDetails;
		}
		return null;
	}

	@Override
	public ProductDetails findProductDetails(ProductDetails prodcutDetails) {
		return productDetailsRepo.findById(prodcutDetails.getId()).get();
	}

	@Override
	public ProductDetails findProductDetailsById(Long id) {
		return productDetailsRepo.findById(id).get();
	}

	@Override
	public List<ProductDetails> findAllProductDetails() {
		return productDetailsRepo.findAll();
	}

}
