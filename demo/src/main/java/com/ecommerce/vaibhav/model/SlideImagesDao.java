package com.ecommerce.vaibhav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slideImages")
public class SlideImagesDao {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	   // @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Column
	    private String fileName;
	   // @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	    @Column(unique = true)
	    private String fileUrl;
	    
	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileUrl() {
			return fileUrl;
		}
		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

}
