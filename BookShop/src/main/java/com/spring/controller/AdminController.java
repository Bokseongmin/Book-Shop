package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.AdminService;
import com.spring.vo.MemberVo;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Resource
	AdminService service;
	
	@RequestMapping("/home")
	public String home() {
		return "admin/home";
	}
	@RequestMapping("/member")
	public String member(Model model) throws Exception {
		logger.info("admin/member - GET POST");
		
		List<MemberVo> list = service.list();
		model.addAttribute("members", list);
		
		return "admin/view/member";
	}
	@RequestMapping("/products")
	public String du() {
		return "admin/view/products";
	}
}
