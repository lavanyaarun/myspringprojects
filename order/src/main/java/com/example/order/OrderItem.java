/**
 * 
 */
package com.example.order;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Lavanya
 *
 */
@Entity
public class OrderItem {
	@Id @GeneratedValue
	private Long id;
	private String productCode;
	private String productName;
	private Integer quantity;
	
	OrderItem(){}
	OrderItem(String productCode, String productName, Integer quantity){
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof OrderItem))
			return false;
		OrderItem orderItem = (OrderItem) o;
		return Objects.equals(this.id, orderItem.id) && Objects.equals(this.productCode, orderItem.productCode)
		        && Objects.equals(this.productName, orderItem.productName)  && Objects.equals(this.quantity, orderItem.quantity);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.productCode, this.productName, this.quantity);
	  }

	  @Override
	  public String toString() {
	    return "OrderItem{" + "id=" + this.id + ", productCode='" + this.productCode + '\'' + ", productName='" + this.productName + '\'' + 
	    		 ", quantity='" + this.quantity + '\'' + '}';
	  }
		

}
