package com.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.BookService;
import com.spring.vo.BookVo;

@Controller
@RequestMapping("/book/*")
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService service;

	@RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
	public void listGET(@RequestParam(value = "keyword", required = false) String keyword, Model model)
			throws Exception {
		List<BookVo> list = service.list(keyword);
		model.addAttribute("books", list);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createGET() {
		logger.info("book/create - GET");
		return "book/create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPOST(BookVo vo) throws Exception {
		logger.info("book/create - POST");

		service.insert(vo);

		return "redirect:/book/list";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detailGET(@RequestParam("book_id") int book_id, Model model) throws Exception {
		logger.info("book/detail - GET");

		BookVo vo = service.detail(book_id);

		model.addAttribute("book", vo);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateGET(@RequestParam("book_id") int book_id, Model model) throws Exception {
		logger.info("book/update - GET");

		BookVo vo = service.detail(book_id);

		model.addAttribute("book", vo);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePOST(@RequestParam("book_id") int book_id, BookVo vo, Model model) throws Exception {
		logger.info("book/update - POST");

		vo.setBook_id(book_id);
		service.update(vo);

		model.addAttribute("book_id", book_id);

		return "redirect:/book/detail";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletePOST(BookVo vo) throws Exception {
		service.delete(vo);

		return "redirect:/book/list";
	}
}
