package com.ecommerce.vaibhav.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserDao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
   // @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
    @Column(unique = true)
    private String emailid;
    @Column
    @JsonIgnore
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}

