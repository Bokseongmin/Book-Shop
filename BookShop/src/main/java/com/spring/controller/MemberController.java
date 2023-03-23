package com.spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.service.MemberService;
import com.spring.vo.MemberVo;

@Controller
@RequestMapping("/sign/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Resource
	MemberService service;

	@RequestMapping(value = "/up", method = RequestMethod.GET)
	public String upGET(MemberVo vo) throws Exception {
		logger.info("sign/up - GET");
		
		return "sign/up";
	}
	
	@RequestMapping(value = "/up", method = RequestMethod.POST)
	public String upPOST(MemberVo vo) throws Exception {
		logger.info("sign/up - POST");
		
		service.signup(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/in", method = RequestMethod.GET)
	public void inGET() throws Exception {
		logger.info("sign/in - GET");
	}
	
	@RequestMapping(value = "/in", method = RequestMethod.POST)
	public String inPOST(MemberVo vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("sign/in - POST");
		
		MemberVo member = service.signin(vo);
		HttpSession session = req.getSession();
		
		if(member != null) {
			session.setAttribute("member", member);
		} else {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/sign/in";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/out", method = RequestMethod.GET)
	public String signout(HttpSession session) throws Exception {
		logger.info("get signout");

		service.signout(session);
		return "redirect:/";
	}
}
