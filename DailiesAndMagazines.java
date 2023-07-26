package com.libraryManagementSystem;

public class DailiesAndMagazines {
	private int id;
	private int price;
	private String name;
	private String mtype;
	private int mCount;
	
	public DailiesAndMagazines(int id, int price, String name, String mtype, int mCount) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.mtype = mtype;
		this.mCount = mCount;
	}
	public int getmCount() {
		return mCount;
	}
	public void setmCount(int mCount) {
		this.mCount = mCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

}
