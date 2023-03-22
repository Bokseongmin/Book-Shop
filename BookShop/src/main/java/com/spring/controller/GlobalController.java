package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.GlobalService;
import com.spring.vo.BookVo;

@Controller
@RequestMapping("/country/*")
public class GlobalController {
	
	@Resource
	GlobalService service;

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping(value = "/kr", method = { RequestMethod.GET, RequestMethod.POST })
	public void get_list_kr(@RequestParam(value = "keyword", required = false) String keyword, Model model)
			throws Exception {
		logger.info("book/list - GET POST");
		String country = "kr";
		List<BookVo> list = service.list(country, keyword);
		model.addAttribute("books", list);
	}
	
	@RequestMapping(value = "/jp", method = { RequestMethod.GET, RequestMethod.POST })
	public void get_list_jp(@RequestParam(value = "keyword", required = false) String keyword, Model model)
			throws Exception {
		logger.info("book/list - GET POST");
		String country = "jp";
		List<BookVo> list = service.list(country, keyword);
		model.addAttribute("books", list);
	}
	@RequestMapping(value = "/us", method = { RequestMethod.GET, RequestMethod.POST })
	public void get_list_us(@RequestParam(value = "keyword", required = false) String keyword, Model model)
			throws Exception {
		logger.info("book/list - GET POST");
		String country = "us";
		List<BookVo> list = service.list(country, keyword);
		model.addAttribute("books", list);
	}
}
