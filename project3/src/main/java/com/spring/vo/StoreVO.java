package com.spring.vo;

public class StoreVO {
	private Integer sID;
	private String sName;
	private String sPNumber;
	private String menu;	
	private Integer price; 
	private String address;
	private String sellID;
	private String category;
	
	public StoreVO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getsID() {
		return sID;
	}

	public void setsID(Integer sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPNumber() {
		return sPNumber;
	}

	public void setsPNumber(String sPNumber) {
		this.sPNumber = sPNumber;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSellID() {
		return sellID;
	}

	public void setSellID(String sellID) {
		this.sellID = sellID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
