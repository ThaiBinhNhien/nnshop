package com.thaibinhnhien.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaibinhnhien.entity.Category;
import com.thaibinhnhien.repository.CategoryRepository;

@Service
public class CategoryDAO {

	@Autowired
	private CategoryRepository<Category> categoryRepository;

	public List<Category> getAll(){
		List<Category> lstCategory = new ArrayList<>();
		lstCategory = (List<Category>) categoryRepository.findAll();
		return lstCategory;
	}
}
