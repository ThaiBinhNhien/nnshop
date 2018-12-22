package com.thaibinhnhien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
	
	@RequestMapping(value="blog", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView();
		model.setViewName("blog/index");
		
		return model;
	}
	
	@RequestMapping(value="blog-detail", method = RequestMethod.GET)
	public ModelAndView detail(){
		ModelAndView model = new ModelAndView();
		model.setViewName("blog/detail");
		
		return model;
	}
}
