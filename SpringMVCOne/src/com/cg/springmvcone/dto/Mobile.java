package com.cg.springmvcone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiledata")
public class Mobile {
	@Id
	@Column(name="mob_id")
 Integer mobileId;
	@Column(name="mob_name")
String mobileName;
	@Column(name="mob_price")
Double mobilePrice;
	@Column(name="mob_cato")
String mobileCategory;
	@Column(name="mob_online")
String option;
	public Mobile(){}
public Mobile(int mobileId, String mobileName, double mobilePrice,
		String mobileCategory, String option) {
	super();
	this.mobileId = mobileId;
	this.mobileName = mobileName;
	this.mobilePrice = mobilePrice;
	this.mobileCategory = mobileCategory;
	this.option = option;
}
public Integer getMobileId() {
	return mobileId;
}
public void setMobileId(Integer mobileId) {
	this.mobileId = mobileId;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public Double getMobilePrice() {
	return mobilePrice;
}
public void setMobilePrice(Double mobilePrice) {
	this.mobilePrice = mobilePrice;
}
public String getMobileCategory() {
	return mobileCategory;
}
public void setMobileCategory(String mobileCategory) {
	this.mobileCategory = mobileCategory;
}
public String getOption() {
	return option;
}
public void setOption(String option) {
	this.option = option;
}



}
