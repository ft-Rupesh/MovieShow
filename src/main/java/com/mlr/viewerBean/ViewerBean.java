package com.mlr.viewerBean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ViewerBean  implements Serializable
{
    private String viewerName,viewerEmail,viewerGender,viewerLanguage,viewerLocation;
    private Long viewerPhoneNo;
    
    // parameter less constructor 
    public ViewerBean() {}
	public String getViewerName() {
		return viewerName;
	}
	public void setViewerName(String viewerName) {
		this.viewerName = viewerName;
	}
	public String getViewerEmail() {
		return viewerEmail;
	}
	public void setViewerEmail(String viewerEmail) {
		this.viewerEmail = viewerEmail;
	}
	public String getViewerGender() {
		return viewerGender;
	}
	public void setViewerGender(String viewerGender) {
		this.viewerGender = viewerGender;
	}
	public String getViewerLanguage() {
		return viewerLanguage;
	}
	public void setViewerLanguage(String viewerLanguage) {
		this.viewerLanguage = viewerLanguage;
	}
	public String getViewerLocation() {
		return viewerLocation;
	}
	public void setViewerLocation(String viewerLocation) {
		this.viewerLocation = viewerLocation;
	}
	public Long getViewerPhoneNo() {
		return viewerPhoneNo;
	}
	public void setViewerPhoneNo(Long viewerPhoneNo) {
		this.viewerPhoneNo = viewerPhoneNo;
	}
    
    
}
