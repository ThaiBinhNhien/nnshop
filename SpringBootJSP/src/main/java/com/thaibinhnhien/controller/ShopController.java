package com.thaibinhnhien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thaibinhnhien.dao.CategoryDAO;
import com.thaibinhnhien.dao.ProductDAO;
import com.thaibinhnhien.entity.Category;
import com.thaibinhnhien.entity.Product;

@Controller
public class ShopController {

	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value="/shop", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView model = new ModelAndView();
		
		List<Category> lstCategory = categoryDAO.getAll();
		
		List<Product> lstProduct = productDAO.getProductAll();
		
		model.addObject("lstCategory", lstCategory);
		model.addObject("lstProduct", lstProduct);
		
		model.setViewName("shop/index");
		return model;
	}
	
	@RequestMapping(value="/shop/{categoryID}", method = RequestMethod.GET)
	public ModelAndView getByCategoryID(@PathVariable("categoryID") Integer categoryID){
		ModelAndView model = new ModelAndView();
		
		List<Category> lstCategory = categoryDAO.getAll();
		
		List<Product> lstProduct = productDAO.getProductByCategoryId(categoryID);
		
		model.addObject("lstCategory", lstCategory);
		model.addObject("lstProduct", lstProduct);
		
		model.setViewName("shop/shopdetail");
		return model;
	}
}
