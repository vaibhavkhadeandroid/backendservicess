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
	private Boolean islogin;
	 
	 @Column
	 private String mobiletype;
	 
	 
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

}
