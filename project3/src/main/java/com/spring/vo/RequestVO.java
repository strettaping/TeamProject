package com.spring.vo;

import java.util.Date;

public class RequestVO {
	private Integer oId;
	private String menu;
	private Integer price;
	private Integer qty;
	private Integer paq;
	private String ocode;
	private String status;
	private String sellId;
	private String buyId;
	private Date oRegdate;
		
	public RequestVO() {
		// TODO Auto-generated constructor stub
	} 


	public Integer getPaq() {
		return paq;
	}


	public void setPaq(Integer paq) {
		this.paq = paq;
	}


	public Integer getoId() {
		return oId;
	}


	public void setoId(Integer oId) {
		this.oId = oId;
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


	public Integer getQty() {
		return qty;
	}


	public void setQty(Integer qty) {
		this.qty = qty;
	}


	public String getOcode() {
		return ocode;
	}


	public void setOcode(String ocode) {
		this.ocode = ocode;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSellId() {
		return sellId;
	}


	public void setSellId(String sellId) {
		this.sellId = sellId;
	}


	public String getBuyId() {
		return buyId;
	}


	public void setBuyId(String buyId) {
		this.buyId = buyId;
	}


	public Date getoRegdate() {
		return oRegdate;
	}


	public void setoRegdate(Date oRegdate) {
		this.oRegdate = oRegdate;
	}
	
	
	
}
