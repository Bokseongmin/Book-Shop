package com.spring.controller;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.spring.service.BookService;
import com.spring.utils.UploadFileUtils;
import com.spring.vo.BookVo;

@Controller
@RequestMapping("/book/*")
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Resource
	BookService service;

	@Resource(name = "uploadPath")
	private String uploadPath;

	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public void listGETPOST(@RequestParam(value = "keyword", required = false) String keyword, Model model)
			throws Exception {
		logger.info("book/list - GET POST");
		List<BookVo> list = service.list(keyword);
		model.addAttribute("books", list);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createGET() {
		logger.info("book/create - GET");
		return "book/create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPOST(BookVo vo, MultipartFile file) throws Exception {
		logger.info("book/create - POST");

		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;
		if (file != null) {
			fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
		} else {
			fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}

		vo.setBook_img(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		vo.setBook_img_thumb(
				File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
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
	public String updatePOST(@RequestParam("book_id") int book_id, BookVo vo, Model model, MultipartFile file, HttpServletRequest req) throws Exception {
		logger.info("book/update - POST");

		// 새로운 파일이 등록되었는지 확인
		if (file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			// 기존 파일을 삭제
			new File(uploadPath + req.getParameter("book_img")).delete();
			new File(uploadPath + req.getParameter("book_img_thumb")).delete();

			// 새로 첨부한 파일을 등록
			String imgUploadPath = uploadPath + File.separator + "imgUpload";
			String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
			String fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(),
					ymdPath);

			vo.setBook_img(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
			vo.setBook_img_thumb(
					File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);

		} else { // 새로운 파일이 등록되지 않았다면
			// 기존 이미지를 그대로 사용
			vo.setBook_img(req.getParameter("book_img"));
			vo.setBook_img_thumb(req.getParameter("book_img_thumb"));

		}
		vo.setBook_id(book_id);
		System.out.println(vo.toString());
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
