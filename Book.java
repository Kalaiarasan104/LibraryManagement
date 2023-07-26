package com.libraryManagementSystem;

//import java.util.Date;

public class Book {
	private int bid;
	private String bname;
	private String author;
	private int price;
	private int bookCount;
	private Date borrowDate;
	private Date returnDate;
	public Book(int bid, String bname, String author, int price,int bookCount,Date borrowDate, Date returnDate) {
		
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.bookCount = bookCount;
		this.borrowDate=borrowDate;
		this.returnDate=returnDate;
	
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Book id-" + bid + " | book name-" + bname + " | author-" + author + " | price-" + price + " | bookCount="
				+ bookCount + " | borrowDate=" + borrowDate + " | returnDate=" + returnDate ;
	}
	
	
	

}
