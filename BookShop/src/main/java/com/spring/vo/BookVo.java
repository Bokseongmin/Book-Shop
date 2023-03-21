package com.spring.vo;

import java.util.Date;

public class BookVo {
	private long book_id;
	private String title;
	private String category;
	private int price;
	private String book_img;
	private String book_img_tmp;
	private Date insert_date;
	
	public long getBook_id() {
		return book_id;
	}
	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public String getBook_img_tmp() {
		return book_img_tmp;
	}
	public void setBook_img_tmp(String book_img_tmp) {
		this.book_img_tmp = book_img_tmp;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
}
