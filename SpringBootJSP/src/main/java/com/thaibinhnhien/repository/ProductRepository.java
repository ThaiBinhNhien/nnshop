package com.thaibinhnhien.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thaibinhnhien.entity.Category;
import com.thaibinhnhien.entity.Product;

public interface ProductRepository<P> extends CrudRepository<Product, Integer> {

	List<P> findAllByCategory(Category category);
}
