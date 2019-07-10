package com.app.navneet.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "book")
public class Book {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long bookId;
	 
	 @Column(name="book_name")
	 private String bookName;
	 
	 @Column(name="auther_name")
	 private String autherName;
	 
	 public String getAutherName() {
		return autherName;
	}
 
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
 
	public int getPrice() {
		return price;
	}
 
	public void setPrice(int price) {
		this.price = price;
	}
 
	@Column(name="price")
	 private int price;
 
	public String getBookName() {
		return bookName;
	}
 
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
 
	public Long getBookId() {
		return bookId;
	}
 
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
 
	
	 
	 
}