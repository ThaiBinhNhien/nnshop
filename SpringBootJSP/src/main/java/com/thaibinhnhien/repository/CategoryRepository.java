package com.thaibinhnhien.repository;

import org.springframework.data.repository.CrudRepository;

import com.thaibinhnhien.entity.Category;

public interface CategoryRepository<P> extends CrudRepository<Category, Integer> {

}
