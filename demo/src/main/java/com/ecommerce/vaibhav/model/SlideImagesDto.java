package com.ecommerce.vaibhav.model;

import javax.persistence.Column;

public class SlideImagesDto {
	
	
	    private String fileName;
	  
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

		private String fileUrl;

}
