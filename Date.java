package com.libraryManagementSystem;

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	
 
	public Date(int dd, int mm, int yyyy) {
		//super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public boolean isValidDate(int dd,int mm,int yyyy) {
		boolean flag=true;
		if(dd<1||dd>31||mm<1||mm>12||yyyy<2023) {
			flag=false;
		} else if(mm==4||mm==6||mm==9||mm==11&&dd>30) {
			flag =false;
		}else if(mm==2||dd>28){
			flag=false;
		}  
		 if(flag){ 
			 return true;
		 }else {
			return false;
		}
		
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	@Override
	public String toString() {
		return  dd + "/" + mm + "/" + yyyy ;
	}
//	public static void addDate(Date date,int noOfDays) {
//		
//	}

}
