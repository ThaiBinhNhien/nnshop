package com.thaibinhnhien.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaibinhnhien.entity.Category;
import com.thaibinhnhien.entity.Product;
import com.thaibinhnhien.repository.CategoryRepository;
import com.thaibinhnhien.repository.ProductRepository;

@Service
public class ProductDAO {

	@Autowired
	private ProductRepository<Product> productRepository;
	@Autowired
	private CategoryRepository<Category> categoryRepository;

	@Transactional
	public List<Product> getProductByCategoryId(int categoryId){
		List<Product> lstProduct = new ArrayList<>();
		try {
			Optional<Category> categoryOptional = categoryRepository.findById(categoryId);
			if(categoryOptional.isPresent())
				lstProduct = productRepository.findAllByCategory(categoryOptional.get());
			return lstProduct;
		}
		catch (Exception e) {
			return lstProduct;
		}
	}

	@Transactional
	public List<Product> getProductAll(){
		List<Product> lstProduct = new ArrayList<>();
		try {
			lstProduct = (List<Product>) productRepository.findAll();
			return lstProduct;
		}
		catch (Exception e) {
			return lstProduct;
		}
	}
}
