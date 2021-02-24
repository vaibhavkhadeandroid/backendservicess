package com.ecommerce.vaibhav.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogindetails")
public class UserLoginDao {
	 
	 
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	   // @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
		@Column(unique = true)
		private String username;
		 
		 @Column
		private Date logintime;
		 @Column
			private Date lastlogouttime;
		
		@Column
		private Boolean islogin;
		 
		 @Column
		 private String mobiletype;
		 
		 
		 
		 @Column
		  private String modelnumber;
		 @Column
		    private String manifacturer;
		 @Column
		    private String brand;
		 @Column
		    private String sdk;
		 @Column
		    private String versioncode;
		 @Column
		    private String imeinumber;
		 
		 public Date getLastlogouttime() {
				return lastlogouttime;
			}
			public void setLastlogouttime(Date lastlogouttime) {
				this.lastlogouttime = lastlogouttime;
			}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getLogintime() {
		return logintime;
	}
	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}
	public Boolean getIslogin() {
		return islogin;
	}
	public void setIslogin(Boolean islogin) {
		this.islogin = islogin;
	}
	public String getMobiletype() {
		return mobiletype;
	}
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSdk() {
		return sdk;
	}
	public void setSdk(String sdk) {
		this.sdk = sdk;
	}
	public String getVersioncode() {
		return versioncode;
	}
	public void setVersioncode(String versioncode) {
		this.versioncode = versioncode;
	}
	public String getImeinumber() {
		return imeinumber;
	}
	public void setImeinumber(String imeinumber) {
		this.imeinumber = imeinumber;
	}

	 
	 
	 
	 
	
}
