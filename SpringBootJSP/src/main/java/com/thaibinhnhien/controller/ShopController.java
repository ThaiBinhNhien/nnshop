package com.thaibinhnhien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thaibinhnhien.dao.CategoryDAO;
import com.thaibinhnhien.entity.Category;

@Controller
public class ShopController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value="/shop", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView model = new ModelAndView();
		
		List<Category> lstCategory = categoryDAO.getAll();
		
		model.addObject("lstCategory", lstCategory);
		
		model.setViewName("shop/index");
		return model;
	}
}
