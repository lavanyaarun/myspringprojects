package com.microservice.custorder;

public class CustOrderItemBean {
	private Long id;
	private String custName;
	private String orderDate;
	private String address;
	private String productCode;
	private String productName;
	private String quantity;
	private Integer total;
	
	public CustOrderItemBean(){}
	
	public CustOrderItemBean(Long id, String custName, String orderDate, String address,
			String productCode, String productName, String quantity, Integer total){
		this.id = id;
		this.custName = custName;
		this.orderDate = orderDate;
		this.address = address;
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.total = total;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
