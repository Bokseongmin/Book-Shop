package com.spring.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.HomeService;
import com.spring.vo.BookVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Resource
	HomeService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<BookVo> top3 = service.top3();
		model.addAttribute("books", top3);
		
		return "home";
	}
	
	public String about(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<BookVo> top3 = service.top3();
		model.addAttribute("books", top3);
		
		return "home";
	}
}
