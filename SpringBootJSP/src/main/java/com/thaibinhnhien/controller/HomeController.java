package com.thaibinhnhien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home/index");
		
		return model;
	}
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home/index");
		
		return model;
	}
	@RequestMapping(value="/home1", method = RequestMethod.GET)
	public ModelAndView home2(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home/indextwo");
		
		return model;
	}
	@RequestMapping(value="/home2", method = RequestMethod.GET)
	public ModelAndView home3(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home/indexthree");
		
		return model;
	}
}
