package com.spring.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.MemberService;
import com.spring.vo.MemberVo;

@Controller
@RequestMapping("/sign/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Resource
	MemberService service;
	
	@RequestMapping(value = "/in", method = RequestMethod.GET)
	public void inGET() throws Exception {
		logger.info("sign/in - GET");
	}
	
	@RequestMapping(value = "/in", method = RequestMethod.POST)
	public String inPOST() throws Exception {
		logger.info("sign/in - POST");
		
		return "redirect:/";
	}

	@RequestMapping(value = "/up", method = RequestMethod.GET)
	public String upGET(MemberVo vo) throws Exception {
		logger.info("sign/up - GET");
		
		return "sign/up";
	}
	
	@RequestMapping(value = "/up", method = RequestMethod.POST)
	public String upPOST(MemberVo vo) throws Exception {
		logger.info("sign/up - POST");
		
		service.signup(vo);
		
		return "sign/in";
	}
}
