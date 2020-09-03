/**
 * 
 */
package com.microservice.custorder;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Lavanya
 *
 */
@Entity
public class CustOrder {
	@Id @GeneratedValue
	private Long id;
	private String custName;
	private String orderDate;
	private String address;
	private String itemId;
	private Integer total;
	
	CustOrder(){}
	CustOrder(String custName, String orderDate, String address, String itemId, Integer total){
		this.custName = custName;
		this.orderDate = orderDate;
		this.address = address;
		this.itemId = itemId;
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
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof CustOrder))
			return false;
		CustOrder custOrder = (CustOrder) o;
		return Objects.equals(this.id, custOrder.id) && Objects.equals(this.custName, custOrder.custName)
		        && Objects.equals(this.orderDate, custOrder.orderDate)  && Objects.equals(this.address, custOrder.address) 
		        		&& Objects.equals(this.itemId, custOrder.itemId) && Objects.equals(this.total, custOrder.total);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.custName, this.orderDate, this.address, this.itemId, this.total);
	  }

	  @Override
	  public String toString() {
	    return "CustOrder{" + "id=" + this.id + ", custName='" + this.custName + '\'' + ", "+ "orderDate='" + this.orderDate + '\'' + 
	    		", "+ "address='" + this.address + '\'' + ", "
	    		+ "itemId='" + this.itemId + '\'' + 
	    		 ", quantity='" + this.total + '\'' + '}';
	  }
		

}
