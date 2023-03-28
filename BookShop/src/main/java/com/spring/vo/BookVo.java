package com.spring.vo;

import java.util.Date;

public class BookVo {
	private long book_id;
	private String title;
	private String country;
	private String category;
	private int price;
	private int stock;
	private String book_img;
	private String book_img_thumb;
	private int view_cnt;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public String getBook_img_thumb() {
		return book_img_thumb;
	}
	public void setBook_img_thumb(String book_img_thumb) {
		this.book_img_thumb = book_img_thumb;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	@Override
	public String toString() {
		return "BookVo [book_id=" + book_id + ", title=" + title + ", category=" + category + ", price=" + price
				+ ", book_img=" + book_img + ", book_img_thumb=" + book_img_thumb + ", view_cnt=" + view_cnt
				+ ", insert_date=" + insert_date + "]";
	}
}
