package com.dio.petshop.service;

import java.util.List;

import com.dio.petshop.model.Product;

public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product saveProduct(Product product);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);
}
