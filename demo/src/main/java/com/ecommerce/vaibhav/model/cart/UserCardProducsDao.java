package com.ecommerce.vaibhav.model.cart;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable  

public class UserCardProducsDao {
	
	@Column
	private long productid;
	
	@Column

	private long quantity;
	
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
