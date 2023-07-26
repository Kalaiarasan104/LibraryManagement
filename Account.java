package com.libraryManagementSystem;

public class Account {
	private int aId;//should be unique
	private String aName;
	private Book[] borrowedBooks=new Book[5];
	private int borrowedBookCount;
	private int donatedBookCount;
	private Book[] donatedBooks;
	public Account(int dId, String dName,Book[] borrowedBooks,int borrowedBookCount, int donatedBookCount, Book[] donatedBooks) {
		this.aId = dId;
		this.aName = dName;
		this.borrowedBooks=borrowedBooks;
		this.borrowedBookCount=borrowedBookCount;
		this.donatedBookCount = donatedBookCount;
		this.donatedBooks = donatedBooks;
	}
	public Account() {
		
	}
	
	public int getAId() {
		return aId;
	}
	public void setAId(int dId) {
		this.aId = dId;
	}
	public String getAName() {
		return aName;
	}
	public void setdName(String dName) {
		this.aName = dName;
	}
	public int getBorrowedBookCount() {
		return borrowedBookCount;
	}
	public void setBorrowedBookCount(int borrowedBookCount) {
		this.borrowedBookCount = borrowedBookCount;
	}
	public int getDonatedBookCount() {
		return donatedBookCount;
	}
	public void setDonatedBookCount(int donatedBookCount) {
		this.donatedBookCount = donatedBookCount;
	}
	public Book[] getDonatedBooks() {
		return donatedBooks;
	}
	public void setDonatedBooks(Book donatedBooks) {
		for (int i = 0; i <this.donatedBooks.length; i++) {
			if(this.donatedBooks[i]!=null) {
				this.donatedBooks[i] = donatedBooks;
				break;
			}
		}
	}
	public Book[] getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(Book borrowedBooks) {
		for (int i = 0; i < this.borrowedBooks.length; i++) {
			if (this.borrowedBooks[i]==null) {
				this.borrowedBooks[i]= borrowedBooks;
				borrowedBookCount++;
				break;
			} 
		}
	}
	@Override
	public String toString() {
		return "Account [dId=" + aId + "| dName=" + aName +"| BorowedBookCount="+getBorrowedBookCount() +"| borrowedBooks \n" + display(getBorrowedBooks())
				+ "| donatedBookCount=" + donatedBookCount + "| donatedBooks \n" + display(getDonatedBooks()) + "]";
	}
	private String display( Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i]!=null) {
				return books[i].toString()+"\n";
			}
		}
		return null;
	}
	
}
