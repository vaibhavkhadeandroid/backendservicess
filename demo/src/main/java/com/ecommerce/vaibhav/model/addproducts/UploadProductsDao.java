package com.ecommerce.vaibhav.model.addproducts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uplodedproducts")
public class UploadProductsDao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productid;
	@Column
	private String productname;
	@Column
	private String productcatagory;
	@Column
	private String sellingprice;
	@Column
	private String costprice;
	@Column
	private String discount;
	@Column
	private String size;
	@Column
	private String numberofitem;
	@Column
	private String productimageurl;
	@Column
	private String uolodeddate;
	public String getUolodeddate() {
		return uolodeddate;
	}
	public void setUolodeddate(String uolodeddate) {
		this.uolodeddate = uolodeddate;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcatagory() {
		return productcatagory;
	}
	public void setProductcatagory(String productcatagory) {
		this.productcatagory = productcatagory;
	}
	public String getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(String sellingprice) {
		this.sellingprice = sellingprice;
	}
	public String getCostprice() {
		return costprice;
	}
	public void setCostprice(String costprice) {
		this.costprice = costprice;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getNumberofitem() {
		return numberofitem;
	}
	public void setNumberofitem(String numberofitem) {
		this.numberofitem = numberofitem;
	}
	public String getProductimageurl() {
		return productimageurl;
	}
	public void setProductimageurl(String productimageurl) {
		this.productimageurl = productimageurl;
	}

}
